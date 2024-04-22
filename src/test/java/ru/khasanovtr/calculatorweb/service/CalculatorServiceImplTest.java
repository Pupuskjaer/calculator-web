package ru.khasanovtr.calculatorweb.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.khasanovtr.calculatorweb.exception.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.khasanovtr.calculatorweb.service.CalculatorWebTestConstants.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplTest {


    private CalculatorServiceImpl service = new CalculatorServiceImpl();

    @Disabled
    void hello() {
    }

    @Test
    void shouldReturnCorrectSum1() {
        assertEquals(ONE + TWO, service.add(ONE, TWO));
    }

    @Test
    void shouldReturnCorrectSum2() {
        assertEquals(THREE + TWO, service.add(THREE, TWO));
    }

    @Test
    void shouldReturnCorrectSubstraction1() {
        assertEquals(TWO - ONE, service.substract(TWO, ONE));
    }

    @Test
    void shouldReturnCorrectSubstraction2() {
        assertEquals(THREE - ONE, service.substract(THREE, ONE));
    }

    @Test
    void shouldReturnCorrectMultiply1() {
        assertEquals(TWO * THREE, service.multiply(TWO, THREE));
    }

    @Test
    void shouldReturnCorrectMultiply2() {
        assertEquals(ZERO * THREE, service.multiply(ZERO, THREE));
    }

    @Test
    void shouldReturnCorrectDivide1() {
        assertEquals(THREE / TWO, service.divide(THREE, TWO));
    }

    @Test
    void shouldReturnCorrectDivide2() {
        assertEquals(THREE / ONE, service.divide(THREE, ONE));
    }

    @Test
    void shouldThrowException() {
        assertThrows(DivideByZeroException.class, () -> service.divide(THREE, ZERO));
    }
}