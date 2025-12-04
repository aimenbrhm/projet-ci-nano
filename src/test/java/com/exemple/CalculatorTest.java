package com.exemple;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator c;

    @BeforeEach
    void setup() {
        c = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(5, c.addition(2, 3));
    }

    @Test
    void testSoustraction() {
        assertEquals(2, c.soustraction(5, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, c.multiplication(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2.5, c.division(5, 2));
    }

    @Test
    void testDivisionParZero() {
        assertThrows(ArithmeticException.class, () -> c.division(10, 0));
    }
}
