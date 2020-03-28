package hm.binkley.exemplar

/** A simple example greeting to the world.  */
class HelloWorld {
    /**
     * Greets the world nicely.
     *
     * @return the global greeting
     */
    fun greet(): String {
        return GREETING
    }

    companion object {
        /** The global greeting.  */
        const val GREETING = "Hello, world!"
    }
}
