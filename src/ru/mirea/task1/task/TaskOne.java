package ru.mirea.task1.task;

import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        int Sum = 0;
        int n = 0;
        System.out.println("Введите количество элементов массива: ");
        Scanner kol = new Scanner(System.in);
        n = kol.nextInt();
        Scanner s = new Scanner(System.in);
        int[]a= new int[n];
        int i=0;
        System.out.println("Введите элементы массива: ");
        while ( i < n) {
            a[i]=s.nextInt();
            Sum=Sum+a[i];
            i++;
        }
        System.out.println("Сумма = "+Sum);
    }
}
