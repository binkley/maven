package xxx;

import lombok.experimental.UtilityClass;

import static java.lang.System.out;

@UtilityClass
public class App {
    public static void main(final String... args) {
        final var greeter = new HelloWorld();

        out.println(greeter.greet());
    }
}
