package com.exemple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private final App app = new App();

    @Test
    void testAdditionner() {
        // Teste une addition simple
        assertEquals(8, app.additionner(5, 3), "5 + 3 devrait être égal à 8");
    }

    @Test
    void testAdditionnerNombresNegatifs() {
        // Teste avec des nombres négatifs
        assertEquals(-2, app.additionner(-5, 3), "-5 + 3 devrait être égal à -2");
    }
}