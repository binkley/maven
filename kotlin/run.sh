#!/usr/bin/env bash
# shellcheck disable=SC2214,SC2215

readonly package=hm.binkley
readonly artifactId=maven-kotlin-exemplar
readonly version=0-SNAPSHOT

# No editable parts below here

export PS4='+${BASH_SOURCE}:${LINENO}:${FUNCNAME[0]:+${FUNCNAME[0]}():} '

set -e
set -u
set -o pipefail

readonly jar=target/$artifactId-$version-jar-with-dependencies.jar
readonly progname="${0##*/}"

function print-help() {
    cat <<EOH
Usage: $progname [-dh]
Runs examples for this library.

  -d, --debug                print script execution to STDERR
  -h, --help                 display this help and exit

Examples:
  $progname            Runs the example
EOH
}

function bad-option() {
    local opt="$1"

    cat <<EOM
$progname: invalid option -- '$opt'
Try '$progname --help' for more information.
EOM
}

function mangle-kotlin-classname() {
    local IFS=.

    local -a parts
    read -r -a parts <<<"$1"
    local last="${parts[-1]}"

    case "$last" in
    *-* | *Kt) ;;
    *) last="${last}Kt" ;;
    esac
    last="${last//-/_}"
    last=""${last^}

    parts[-1]="$last"

    echo "${parts[*]}"
}

function rebuild-if-needed() {
    [[ -e "$jar" && -z "$(find src/main -type f -newer "$jar")" ]] && return

    ./mvnw -C -Dmaven.test.skip=true package
}

debug=false
while getopts :dh-: opt; do
    [[ $opt == - ]] && opt=${OPTARG%%=*} OPTARG=${OPTARG#*=}
    case $opt in
    d | debug) debug=true ;;
    h | help)
        print-help
        exit 0
        ;;
    *)
        bad-option "$opt"
        exit 2
        ;;
    esac
done
shift $((OPTIND - 1))

$debug && set -x

set - -jar "$jar" "$@"

rebuild-if-needed

exec java "$@"
