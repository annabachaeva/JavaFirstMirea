package ru.mirea.task22;

public class Сlient {
    public static void main(String[] args) {
        ChairFactory chair;
        chair = new ViewChairFactory();
        chair.createMagic();
    }
}
