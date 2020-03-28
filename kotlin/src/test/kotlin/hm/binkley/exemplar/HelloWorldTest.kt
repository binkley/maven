package hm.binkley.exemplar

import hm.binkley.exemplar.HelloWorld.Companion.GREETING
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class HelloWorldTest {
    @Test
    fun shouldGreet() {
        assertEquals(GREETING, HelloWorld().greet())
    }
}
