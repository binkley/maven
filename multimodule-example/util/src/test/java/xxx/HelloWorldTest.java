package xxx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    @Test
    void shouldGreetWarmly() {
        final var greeter = new HelloWorld();

        assertEquals("Hello, world!", greeter.greet());
    }
}
