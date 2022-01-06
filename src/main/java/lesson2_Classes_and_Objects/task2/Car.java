package main.java.lesson2_Classes_and_Objects.task2;

public class Car {
    private int year;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this(year);
        this.color = color;
    }
}
