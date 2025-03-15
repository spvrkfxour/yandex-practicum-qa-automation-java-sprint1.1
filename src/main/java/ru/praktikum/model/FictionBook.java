package ru.praktikum.model;

import static ru.praktikum.model.constants.Discount.FANTASY_DISCOUNT;
import static ru.praktikum.model.constants.Genre.FANTASY;

public class FictionBook extends Book implements Discountable {
    private String genre;

    public FictionBook(String title, String author, int year, double price, String genre) {
        super(title, author, year, price, true);
        this.genre = genre;
    }

    @Override
    public String getBookType() {
        return "Fiction";
    }

    @Override
    public double getDiscount() {
        return genre.equals(FANTASY) ? FANTASY_DISCOUNT : 0;
    }

    public String getGenre() {
        return genre;
    }
}
