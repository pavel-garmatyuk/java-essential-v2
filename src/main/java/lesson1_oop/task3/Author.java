package main.java.lesson1_oop.task3;

public class Author {
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println(this.author);
    }
}
