package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloCalculatorImpl implements HelloService {

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
        if ((num2 == 0)) {
            new DivideByZero();
        } return (num1 / num2);//можно и без указания библиотеки
    }

}