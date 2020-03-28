package hm.binkley.exemplar.kotlin

import hm.binkley.exemplar.kotlin.HelloWorld.Companion.GREETING
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.lang.String.format
import java.lang.System.out
import java.lang.System.setOut

class HelloWorldIT {
    /**
     * @todo Setting [System.out] does not support parallel tests
     * @todo Better IT tests would use a framework to manage shared statics
     */
    @Test
    fun shouldGreet() {
        val baos = ByteArrayOutputStream()
        val capture = PrintStream(baos)
        val restore = out
        try {
            setOut(capture)
            main()
        } finally {
            setOut(restore)
        }

        assertEquals(format("%s\n", GREETING), baos.toString())
    }
}
