package ru.mirea.task10;

import java.util.Scanner;

public class Var_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = sc.nextInt();
        System.out.println(sum(digit));
    }

    static int sum(int digit){
        if (digit>0) {
            return digit % 10 + sum(digit / 10);
        }
        else{return 0;}
    }
}
