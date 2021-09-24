package ru.mirea.task3.Human;

public abstract class Human {
    private String name;
    private String age;
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public Human(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public abstract void showInf();
}

class Head extends Human {
    private String color_head;
    public Head(String name, String age, String color_head){
        super(name, age);
        this.color_head = color_head;
    }
    public void showInf() {
        System.out.println("Name: " + super.getName() + "Age: " + getAge() + "Color head: " + color_head);
    }
}
class Leg extends Human {
    private String size_leg;
    public Leg(String name, String age, String size_leg){
        super(name, age);
        this.size_leg = size_leg;
    }
    public void showInf() {
        System.out.println("Name: " + super.getName() + "Age: " + getAge() + "Size leg: " + size_leg);
    }
}
class Hand extends Human {
    private String size_hand;
    public Hand(String name, String age, String size_hand){
        super(name, age);
        this.size_hand = size_hand;
    }
    public void showInf() {
        System.out.println("Name: " + super.getName() + "Age: " + getAge() + "Size hand: " + size_hand);
    }
}