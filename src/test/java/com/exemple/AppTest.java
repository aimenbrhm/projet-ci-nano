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
    void testAdditionner() {
        // BUG INTENTIONNEL: 5 + 3 devrait être 8, mais on attend 9
        assertEquals(9, app.additionner(5, 3), "Ceci va échouer intentionnellement.");
    }
    
}