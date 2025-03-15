package ru.praktikum.service;

import ru.praktikum.model.Book;
import ru.praktikum.model.Discountable;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (Book book : books) {
            totalPrice += book.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Book book : books) {
            if (book instanceof Discountable) {
                totalPrice += book.getPrice() * (1 - ((Discountable) book).getDiscount() / 100);
            } else {
                totalPrice += book.getPrice();
            }
        }
        return  totalPrice;
    }

    public double getTotalAvailableBooksPrice() {
        double totalPrice = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                totalPrice += book.getPrice();
            }
        }
        return totalPrice;
    }
}
