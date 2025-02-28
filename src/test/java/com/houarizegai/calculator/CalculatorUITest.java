package com.example.calculator.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void testAddition() {
        assertEquals(10, calculatorService.add(5, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(3, calculatorService.subtract(8, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(20, calculatorService.multiply(4, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculatorService.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculatorService.divide(10, 0));
    }
}
