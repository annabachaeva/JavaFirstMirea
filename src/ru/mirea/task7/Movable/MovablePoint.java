package ru.mirea.task7.Movable;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        y += y;
    };
    @Override
    public void moveDown() {
        y -= y;
    };
    @Override
    public void moveLeft() {
        x += x;
    };
    @Override
    public void moveRight() {
        y -= y;
    };
    public String toString() {
        return "Point move up or move down on: " + x + "Point move left or right on: " + y;
    };
}
