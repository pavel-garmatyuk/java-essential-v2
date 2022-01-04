package main.java.lesson1_oop.task2;

import java.util.Scanner;

public class task2Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Ввести два числа");
        System.out.println("Площадь прямоугольника: " + rectangle.areaCalculator(console.nextDouble(), console.nextDouble()));
        System.out.println("Периметр прямоугольника: " + rectangle.perimeterCalculator(console.nextDouble(),console.nextDouble()));
    }
}
