package ru.khasanovtr.calculatorweb.exception;

public class DivideByZeroException extends IllegalArgumentException {
    public DivideByZeroException(String s) {
        super(s);
    }
}
