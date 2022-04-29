package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {
    private final HelloCalculatorImpl out = new HelloCalculatorImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void plus(int num1, int num2) {
        assertEquals(num1 + num2, out.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void minus(int num1, int num2) {
        assertEquals(num1 - num2, out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void multiply(int num1, int num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void divide(int num1, int num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }

    public static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(2, 2),
                Arguments.of(2, 0),
                Arguments.of(4, 1),
                Arguments.of(0, 0));

    }
}
