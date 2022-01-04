package main.java.lesson1_oop.task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setAuthor("Дейт");
        title.setTitle("Введение в системы баз данных");
        content.setContent("Фундаментальные знания о реляционных базах данных");

        author.show();
        title.show();
        content.show();
    }
}
