package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorApplicationTests {
    private final HelloCalculatorImpl out = new HelloCalculatorImpl();

    @Test
    void itIsIllegalArgumentException() {
        assertThrows(DivideByZero.class, () -> {
            out.divide(2, 0);
        });
    }

    @Test
    void plus() {
        assertEquals(3, out.plus(1, 2));
    }

    @Test
    void minus() {
        assertEquals(1, out.minus(2, 1));
    }

    @Test
    void multiply() {
        assertEquals(4, out.multiply(2, 2));
    }

    @Test
    void divide() {
        assertEquals(1, out.divide(2, 2));
    }

}
