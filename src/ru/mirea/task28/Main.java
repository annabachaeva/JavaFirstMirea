package ru.mirea.task28;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        //использование регулярных выражений для вывода сообщения в консоль
        List message_1 = new ArrayList();
        List message_2 = new ArrayList();
        message_1.add("The player is Lightning!");
        message_2.add("The enemy is green cars!");

        String regex = "^[A-za-z\\s]+!$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher("The player is Lightning!");
        Matcher matcher_1 = pattern.matcher("The enemy is green cars!");

        switch(h) {
            case Player:
                System.out.println(message_1 +" : "+ matcher.matches());
                break;
            case Enemy:
                System.out.println(message_2 +" : "+ matcher_1.matches());
                break;
        }
    }
}
