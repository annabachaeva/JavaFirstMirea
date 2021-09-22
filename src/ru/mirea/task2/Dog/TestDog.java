package ru.mirea.task2.Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jack", 5);
        Dog d2 = new Dog("Lui", 2);
        Dog d3 = new Dog("", 4);
        d3.setName("Kol");
        System.out.println(d2);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
