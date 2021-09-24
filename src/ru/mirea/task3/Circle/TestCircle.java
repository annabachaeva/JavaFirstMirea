package ru.mirea.task3.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0, 6.0, "white");
        System.out.println("Diametr is "+c1.getDiametr()
        + " Color is "+c1.getColor()
        + " Radius is "+c1.getRadius()
        + " Area is " +c1.getArea());
        Circle c2 = new Circle(5.0, 10.0);
        System.out.println("Diametr is "+c2.getDiametr()
                + " Color is "+c2.getColor()
                + " Radius is "+c2.getRadius()
                + " Area is " +c2.getArea());
    }
}
