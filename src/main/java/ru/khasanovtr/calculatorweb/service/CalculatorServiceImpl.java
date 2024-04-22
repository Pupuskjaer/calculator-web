package ru.khasanovtr.calculatorweb.service;

import org.springframework.stereotype.Service;
import ru.khasanovtr.calculatorweb.exception.DivideByZeroException;
import ru.khasanovtr.calculatorweb.service.CalculatorService;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String hello() {
        return "Добро пожаловать в калькулятор!!!";
    }

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("Делить на ноль нельзя");
        } else {
            return num1 / num2;
        }
    }
}
