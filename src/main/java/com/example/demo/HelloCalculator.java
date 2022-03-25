package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloCalculator implements HelloService {

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
    public String divide(int num1, int num2) {
        if ((num2 == 0)) {
            return "Ошибка деления на ноль";

        } else return java.lang.String.valueOf(num1 / num2);
    }

}