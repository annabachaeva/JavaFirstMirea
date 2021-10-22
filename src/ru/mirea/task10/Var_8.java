package ru.mirea.task10;

import java.util.Scanner;

//палиндром

public class Var_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = sc.nextLine();
        System.out.println(palindrom(word));
    }

    static String palindrom(String str){
        if (str.charAt(0)==str.charAt(str.length()-1)){
            return palindrom(str,1);
        }
        else {return "Это слово является полиндромом? " + "NO";}
    }

    static String palindrom(String str, int i){
        if (i>str.length()/2){
            return "Это слово является полиндромом? " + "YES";
        }
        if (str.charAt(i)==str.charAt(str.length()-1-i)){
            return palindrom(str, ++i);
        }
        else{
            return "Это слово является полиндромом? " + "NO";
        }
    }
}
