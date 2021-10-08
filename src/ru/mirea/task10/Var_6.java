package ru.mirea.task10;

import java.util.Scanner;

public class Var_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = sc.nextInt();
        System.out.println(simple_digit_ans(digit));
    }

    static String simple_digit_ans(int digit){
        if (digit==1){
            return "YES";
        }
        return simple_digit_ans(digit, digit-1);
    }

    public static String simple_digit_ans(int digit, int div){
        if (div==1){
            return "YES";
        }
        if (digit%div==0){
            return "NO";
        }
        else{
            return simple_digit_ans(digit, div-1);
        }
    }
}
