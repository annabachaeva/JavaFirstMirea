package ru.mirea.task3.Book;

public class Book {
    private String name;
    private int year;

    public Book(String n, int y) {
        name = n;
        year = y;
    }
    public Book(String n) {
        name = n;
        year = 0;
    }
    public Book() {
        name = "Anna Karenina";
        year = 1878;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }
    public int getYear(int year) {
        return year;
    }
    public String toString() {
        return this.name+", year "+this.year;
    }
}
