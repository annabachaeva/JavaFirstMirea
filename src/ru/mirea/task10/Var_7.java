package ru.mirea.task10;

import java.util.Scanner;

public class Var_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = sc.nextInt();

        int temp = digit;
        String out = "";
        for (int i=2; i<=digit; i++){
            while(/*temp%i==0 && Var_6.simple_digit_ans(i)*/){
                temp/=i;
                out += Integer.toString(i)+" ";
            }
        }
        System.out.println(out);
    }
}