package ru.mirea.task13.ArrayList;

import java.util.ArrayList;
import java.util.*;


public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> music = new ArrayList<String>();
        music.add("Pop");
        music.add("Rock");
        music.add("Jazz");
        music.add("Indie");
        music.add("Techno");

        music.add(0, "Folke");

        System.out.println("Первый объект: " + music.get(0));

        System.out.printf("Список содержит " + music.size() + " элементов: \n");
        for (String state : music) {
            System.out.println(state);
        }

        List<String> music_2 = music.subList(2, 5);
        System.out.printf("Элементы на позициях с 3 по 5: " + music_2 + "\n");

        music.remove("Rock");
        System.out.println("Полученный список, после удаления элемента 'Rock': " + music);
    }
}
