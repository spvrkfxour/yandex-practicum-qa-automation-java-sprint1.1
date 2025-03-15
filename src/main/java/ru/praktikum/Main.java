package ru.praktikum;

import ru.praktikum.model.Book;
import ru.praktikum.model.FictionBook;
import ru.praktikum.model.TextBook;
import ru.praktikum.model.constants.Genre;
import ru.praktikum.model.constants.Subject;
import ru.praktikum.service.Library;

public class Main {
    public static void main(String[] args) {
        FictionBook book1 = new FictionBook("Harry Potter", "J. K. Rowling", 1997, 500.0, Genre.FANTASY);
        TextBook book2 = new TextBook("Advanced Mathematics", "Ivanov", 2020, 800.50, Subject.MATHEMATICS);
        FictionBook book3 = new FictionBook("1984", "George Orwell", 1949, 400.0, Genre.DYSTOPIA);

        Book[] books = {book1, book2, book3};

        Library library = new Library(books);

        System.out.println("Общая стоимость книг без скидки: " + library.getTotalPriceWithoutDiscount());
        System.out.println("Общая стоимость книг со скидкой: " + library.getTotalPriceWithDiscount());
        System.out.println("Общая стоимость доступных книг: " + library.getTotalAvailableBooksPrice());
    }
}