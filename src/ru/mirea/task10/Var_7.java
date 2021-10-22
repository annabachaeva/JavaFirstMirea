package ru.mirea.task10;

import java.util.Scanner;

//разложение числа на простые множители

public class Var_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int digit = sc.nextInt();

        int temp = digit;
        String out = "";
        for (int i=2; i<=digit; i++){
            while(temp%i==0 && simple_digit_ans(i)){
                temp/=i;
                out += Integer.toString(i) + " ";
            }
        }
        System.out.println(out);
    }
    static boolean simple_digit_ans(int digit){
        if (digit==1){
            return true;
        }
        return simple_digit_ans(digit, digit-1);
    }

    public static boolean simple_digit_ans(int digit, int div){
        if (div==1){
            return true;
        }
        if (digit%div==0){
            return false;
        }
        else{
            return simple_digit_ans(digit, div-1);
        }
    }
}