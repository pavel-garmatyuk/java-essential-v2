package main.java.lesson2_Classes_and_Objects.task3;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2019);
        Car car3 = new Car(2019, 175.5);
        Car car4 = new Car(2020, 220, 1750);
        Car car5 = new Car(2016, 180, 1650, "red");
    }
}
