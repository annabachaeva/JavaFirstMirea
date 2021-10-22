package ru.mirea.task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("Введите карты первого игрока: ");
        /*Scanner firstPlayerCards = new Scanner(System.in);
        String firstPlayerCards;
        firstPlayerCards = in.nextLine();*/
        GameStack.run();
        GameDeque.run();
        GameQueue.run();
        GameLinked.run();
    }
}
