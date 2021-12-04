package ru.mirea.task20;

import ru.mirea.Wheelbarrows.Road;

import javax.swing.*;
import java.lang.Enum;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

enum Heroes {
    Player, Enemy
}

//главная функция взята из проекта Wheelbarrows
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Wheelbarrows");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200, 600);
        f.add(new Road());
        f.setVisible(true);

        //выводит дату и время создания игры
        Calendar calendar = new GregorianCalendar(2021, Calendar.NOVEMBER , 21);
        calendar.set(Calendar.HOUR, 00);
        calendar.set(Calendar.MINUTE, 00);
        calendar.set(Calendar.SECOND, 00);

        System.out.println(calendar.getTime());

        ru.mirea.Wheelbarrows.Heroes h;
        h = ru.mirea.Wheelbarrows.Heroes.Player;
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