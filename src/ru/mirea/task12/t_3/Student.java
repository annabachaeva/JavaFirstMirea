package ru.mirea.task12.t_3;

public class Student {
    private int ID;
    private String name;
    private int ball;

    public Student(int ID, String name, int ball) {
        setID(ID);
        setName(name);
        setBall(ball);
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getBall() {
        return ball;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBall(int ball) {
        this.ball = ball;
    }
    @Override
    public String toString() {
        return " ID: " + ID + ", Name: " + name + ", Ball: " + ball;
    }
}
