package ru.mirea.task8.task1;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle()
    {
        super();
        this.length = (int)(Math.random()*200);
        this.width = (int)(Math.random()*200);
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}