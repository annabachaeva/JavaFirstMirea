package ru.mirea.task3.Circle;


public class Circle {
    private double radius;
    private double diametr;
    private String color;
    public Circle() {
        radius = 2.0;
        diametr = 4.0;
        color = "green";
    }
    public Circle(double r) {
        radius = r;
        diametr = 4.0;
        color = "green";
    }
    public Circle(double r, double d) {
        radius = r;
        diametr = d;
        color = "green";
    }
    public Circle(double r, double d, String c) {
        radius = r;
        diametr = d;
        color = c;
    }
    public double getRadius() {
        return radius;
    }
    public double getDiametr() {
        return diametr;
    }
    public String getColor() {
        return color;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
