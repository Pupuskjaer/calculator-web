package ru.khasanovtr.calculatorweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.khasanovtr.calculatorweb.service.CalculatorService;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/plus")
    public int add(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.add(num1, num2);
    }
    @GetMapping("/minus")
    public int substract(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.substract(num1, num2);
    }
    @GetMapping("/multiply")
    public int multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping("/divide")
    public int divide(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.divide(num1, num2);
    }
}
