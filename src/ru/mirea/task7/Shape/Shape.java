package ru.mirea.task7.Shape;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {}
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape {
    protected double radius;
    public Circle() {};
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public String toString() {
        return "Area circle: "+this.getArea()+" Perimeter circle: "+this.getPerimeter();
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {};
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
    public String toString() {
        return "Area rectangle: "+this.getArea()+" Perimeter rectangle: "+this.getPerimeter();
    }
}

class Square extends Rectangle {
    protected double side;
    public Square() {};
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    /*@Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }*/
    public String toString() {
        return "Area square: "+this.getArea()+" Perimeter square: "+this.getPerimeter();
    }
}


