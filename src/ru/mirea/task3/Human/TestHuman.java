package ru.mirea.task3.Human;

public class TestHuman  {
    public static void main(String[] args) {
        Head head1 = new Head("Jack ", "18 ", "bread");
        head1.showInf();
        Leg leg1 = new Leg("Jack ", "18 ", "40");
        leg1.showInf();
        Hand hand1 = new Hand("Jack ", "18 ", "65 sm");
        hand1.showInf();
    }
}
