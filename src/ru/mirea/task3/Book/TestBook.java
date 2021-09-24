package ru.mirea.task3.Book;

import ru.mirea.task2.Book.Book;

public class TestBook {
    public static void main(String[] args) {
        ru.mirea.task2.Book.Book b1 = new ru.mirea.task2.Book.Book("",1936);
        ru.mirea.task2.Book.Book b2 = new ru.mirea.task2.Book.Book("Chapaev and the void", 1996);
        ru.mirea.task2.Book.Book b3 = new Book("The secret history");
        b3.setYear(1992);
        b1.setName("Tree comrades");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
