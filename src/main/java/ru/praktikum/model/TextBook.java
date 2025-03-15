package ru.praktikum.model;

import static ru.praktikum.model.constants.Discount.MATHEMATICS_DISCOUNT;
import static ru.praktikum.model.constants.Subject.MATHEMATICS;

public class TextBook extends Book implements Discountable {
    private String subject;

    public TextBook(String title, String author, int year, double price, String subject) {
        super(title, author, year, price, false);
        this.subject = subject;
    }

    @Override
    public String getBookType() {
        return "TextBook";
    }

    @Override
    public double getDiscount() {
        return subject.equals(MATHEMATICS) ? MATHEMATICS_DISCOUNT : 0;
    }

    public String getSubject() {
        return subject;
    }
}
