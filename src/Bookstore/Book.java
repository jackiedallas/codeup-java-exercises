package Bookstore;

public class Book extends Product{
    protected String author;

    public Book(String author, String title, double price) {
        super(title, price);
        this.author = author;
    }
}
