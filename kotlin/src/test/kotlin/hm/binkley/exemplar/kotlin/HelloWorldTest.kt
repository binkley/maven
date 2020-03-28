package hm.binkley.exemplar.kotlin

import hm.binkley.exemplar.kotlin.HelloWorld.Companion.GREETING
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class HelloWorldTest {
    @Test
    fun shouldGreet() {
        assertEquals(
            GREETING, HelloWorld()
                .greet()
        )
    }
}
