import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CustomSourceSetTest {
    @Test
    void customSourceSetIsNotPartOfRuntimeClasspath() {
        assertThrows(ClassNotFoundException.class, () -> Class.forName("org.example.ClassInCustomSourceSet"));
    }
}
