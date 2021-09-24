package ru.mirea.task4.Ball;

import ru.mirea.task2.Ball.Ball;

public class TestBall {
    public static void main(String[] args) {
        ru.mirea.task2.Ball.Ball b1 = new Ball(50, 40);
        System.out.println(b1);
        b1.move(10, 5);
        System.out.println(b1);
    }
}
