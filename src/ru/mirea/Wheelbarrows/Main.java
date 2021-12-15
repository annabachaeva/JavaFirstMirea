package ru.mirea.Wheelbarrows;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.lang.Enum;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

enum Heroes {
    Player, Enemy
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
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

        //CЕРИАЛИЗАЦИЯ И ДЕСЕРИАЛИЗАЦИЯ
        //создаем наш объект
        String[] playInfo = {"Игра успешно запущена и продолжает действовать!"};

        SavedGame savedGame = new SavedGame(playInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Аня\\Desktop\\уник\\java\\тачки\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем игру в файл
        objectOutputStream.writeObject(savedGame);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Аня\\Desktop\\уник\\java\\тачки\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        savedGame = (SavedGame) objectInputStream.readObject();

        System.out.println(savedGame);
    }
}
