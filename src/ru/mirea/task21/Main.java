package ru.mirea.task21;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

enum Heroes {
    Player, Enemy
}

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Wheelbarrows");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200, 600);
        f.add(new Road());
        f.setVisible(true);

        //выводит дату создания игры
        Calendar calendar = new GregorianCalendar(2021, Calendar.NOVEMBER , 21);
        calendar.set(Calendar.HOUR, 00);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);

        System.out.println(calendar.getTime());

        Heroes h;
        h = Heroes.Player;
        switch(h) {
            case Player:
                System.out.println("Игрок - это Молния!");
                break;
            case Enemy:
                System.out.println("Враг - это зеленые машины");
                break;
        }
    }
}
