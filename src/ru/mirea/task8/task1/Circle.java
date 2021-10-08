package ru.mirea.task8.task1;

public class Circle extends Shape {
    private int radius;
    public Circle()
    {
        super();
        this.radius = (int)(Math.random()*250);
    }

    public int getRadius() {
        return radius;
    }
}
