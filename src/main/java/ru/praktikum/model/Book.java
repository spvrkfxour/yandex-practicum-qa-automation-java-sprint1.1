package ru.praktikum.model;

public abstract class Book {
    protected String title;
    protected String author;
    protected int year;
    protected double price;
    protected boolean isAvailable;

    public Book(String title, String author, int year, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public abstract String getBookType();

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
