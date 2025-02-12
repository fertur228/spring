package org.example;

public class Calculator {

    private int a;
    private int b;


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Методы для вычислений
    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public int divide() {
        if (b == 0) {
            throw new ArithmeticException("Не можем делить на 0");
        }
        return a / b;
    }
}

