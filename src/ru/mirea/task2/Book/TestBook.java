package ru.mirea.task2.Book;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("",1936);
        Book b2 = new Book("Chapaev and the void", 1996);
        Book b3 = new Book("The secret history");
        b3.setYear(1992);
        b1.setName("Tree comrades");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
