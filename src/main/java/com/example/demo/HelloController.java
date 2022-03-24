package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    private final HelloCalculator helloCalculator;

    public HelloController(HelloCalculator helloCalculator) {
        this.helloCalculator = helloCalculator;
    }

    @GetMapping(path = "/calculator")
    public String welcomeToCalculator() {
        return helloCalculator.welcomeToCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public int plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return helloCalculator.plus(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public int minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return helloCalculator.minus(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public int multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return helloCalculator.multiply(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public int divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return helloCalculator.divide(num1, num2);
    }
}
