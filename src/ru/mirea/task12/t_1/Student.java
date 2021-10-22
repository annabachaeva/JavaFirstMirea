package ru.mirea.task12.t_1;

import java.lang.*;
import java.util.Random;

public class Student {
    /*public static void insertSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }*/
    public static void main(String[] args) {
        int[] iDNumber = new int[20];
        for (int i = 0; i < iDNumber.length; i++) {
            iDNumber[i] = ((int)(Math.random() * 500) - 1);
            //System.out.println(iDNumber[i]);
        }
        for (int left = 0; left < iDNumber.length; left++) {
            int value = iDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < iDNumber[i]) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    break;
                }
            }
            iDNumber[i + 1] = value;
        }
        for (int i = 0; i < iDNumber.length; i++) {
            System.out.println(iDNumber[i]);
        }
    }
}
