package ru.mirea.task17;

import ru.mirea.Wheelbarrows.Road;

import javax.swing.*;
import java.lang.Enum;

enum Heroes {
    Player, Enemy
}

//используется в главной функции проекта
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("Wheelbarrows");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200, 600);
        f.add(new Road());
        f.setVisible(true);

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
