package xxx;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void shouldPrintWarmly() throws Exception {
        final var out = tapSystemOut(App::main);

        assertEquals("Hello, world!\n", out);
    }
}
