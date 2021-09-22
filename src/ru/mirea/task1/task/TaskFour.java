package ru.mirea.task1.task;

import java.util.Scanner;
import java.util.Random;

public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Размер массива: ");
        int n;
        int[] array;
        Scanner arr = new Scanner(System.in);
        n = arr.nextInt();
        array = new int [n];
        for (int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random() * 100);
        for (int i : array)
            System.out.println(i + " ");
    }
}
