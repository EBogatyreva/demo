package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloCalculator implements HelloService {
    int sum;

    @Override
    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if ((num1 == 0)) {
            itIsError(num1);
        } else if ((num1 != 0) && (num2 != 0)) sum = num1 / num2;
        return sum;
    }

    @Override
    public void itIsError(int num1) {
        try {
            boolean b = (num1 == 0);

        } catch (ArithmeticException e) {
            System.out.println("Введите оба параметра");

        }

    }
}