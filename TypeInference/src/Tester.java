import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
    @Test
    public void whenVarInitWithString_thenGetStringTypeVar() {
        var message = "Hello, Java 10";
        assertTrue(message instanceof String);
    }

    @Test
    public void whenVarInitWithAnonymous_thenGetAnonymousType() {
        var obj = new Object() {};
        assertFalse(obj.getClass().equals(Object.class));
    }

    @Test
    public void lambdaSupport() {
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        assertTrue(resultString.equals("JAVA, KOTLIN"));
    }
}
