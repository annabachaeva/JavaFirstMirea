package ru.mirea.task6;

public class Name implements Nameable {
    public void getName() {
        System.out.println("Плутон");
    }
    public static void main(String[] args) {
        Name n1 = new Name();
        n1.getName();
    }
}
