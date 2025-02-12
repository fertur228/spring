package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        //Parrot parrot = context.getBean(Parrot.class); //Parrot parrot = context.getBean("parrotNurdaulet", Parrot.class)

        Calculator calculator = context.getBean(Calculator.class);

        // Устанавливаем значения через сеттеры
        calculator.setA(10);
        calculator.setB(5);

        // Применяем методы калькулятора
        int sum = calculator.add();
        int difference = calculator.subtract();
        int product = calculator.multiply();
        int quotient = calculator.divide();

        // Выводим результаты
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        context.close();

    }
}