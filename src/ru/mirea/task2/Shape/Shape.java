package ru.mirea.task2.Shape;

public class Shape {
    private String name;
    private String color;

    public Shape() {
        name = "circle";
        color = "white";
    }
    public Shape(String n) {
        name = n;
        color = "white";
    }
    public Shape(String n, String c) {
        name = n;
        color = c;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String toString() {
        return "the "+this.name+" is "+this.color;
    }
}
