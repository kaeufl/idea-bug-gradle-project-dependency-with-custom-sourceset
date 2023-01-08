package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Compiles and succeeds when run with gradle, but not with IntelliJ.
 */
public class CustomSourceSetTest {
    @Test
    void customSourceSetOfProviderJarIsPartOfCompileClasspath() {
        new ClassInCustomSourceSet();
    }

    @Test
    void customSourceSetOfProviderJarIsPartOfRuntimeClasspath() {
        assertDoesNotThrow(() -> Class.forName("org.example.ClassInCustomSourceSet"));
    }
}
