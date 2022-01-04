package main.java.lesson1_oop.task4;

public class Computer {
    String details;

    public static void main(String[] args) {
        Computer[] computer = new Computer[5];
        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();

        for (int i = 0; i < computer.length; i++) {
            computer[i].details = "part " + i;
        }
        for (int i = 0; i < computer.length; i++) {
            Computer comp = computer[i];
            System.out.println("detail: " + comp.details);
        }
    }
}
