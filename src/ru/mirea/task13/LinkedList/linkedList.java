package ru.mirea.task13.LinkedList;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<Integer>();
        number.add(9);
        number.add(10);
        number.add(11);
        number.add(12);

        number.addFirst(8);
        number.addLast(13);

        System.out.printf("В списке содержится " + number.size() + " элементов\n");
        System.out.println("Первый элемент списка: " + number.getFirst() + "\n");
        System.out.println("Последний элемент списка: " + number.getLast() + "\n");

        System.out.println("Список: ");
        for (Integer num : number) {
            System.out.println(num);
        }

        number.removeFirst();
        System.out.println("Список после удаления элемента: " + number);
    }
}
