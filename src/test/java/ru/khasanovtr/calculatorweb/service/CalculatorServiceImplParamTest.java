package ru.khasanovtr.calculatorweb.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.khasanovtr.calculatorweb.exception.DivideByZeroException;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static ru.khasanovtr.calculatorweb.service.CalculatorWebTestConstants.*;

public class CalculatorServiceImplParamTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @Disabled
    void hello() {
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectSum(int num1,int num2) {
        assertEquals(num1 + num2, service.add(num1, num2));
    }


    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectSubstraction(int num1,int num2) {
        assertEquals(num1 - num2, service.substract(num1, num2));
    }


    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectMultiply(int num1,int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParams")
    void shouldReturnCorrectDivide(int num1,int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(ZERO,ONE),
                Arguments.of(TWO,ONE),
                Arguments.of(THREE,TWO),
                Arguments.of(THREE,ONE),
                Arguments.of(TWO,TWO)

        );
    }
}
