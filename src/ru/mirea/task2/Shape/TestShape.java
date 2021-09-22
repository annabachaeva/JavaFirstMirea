package ru.mirea.task2.Shape;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("circle","white");
        Shape s2 = new Shape("square", "yellow");
        Shape s3 = new Shape("triangle", "red");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
