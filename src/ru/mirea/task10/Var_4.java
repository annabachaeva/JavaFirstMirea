package ru.mirea.task10;

import java.util.Scanner;

//k-значные числа и сумма равна s

public class Var_4 {
    public static int sum(int length, int sum, int k, int s) {
        if (length == k) {
            if (sum == s) {
                return 1;
            }
            else {
                return 0;
            }
        }
        int c = (length == 0 ? 1 : 0);
        int ans = 0;
        int digit;
        for (int i = 0; i < 10; i++) {
            ans += sum(length + 1, sum + i, k ,s);
        }
        return ans;
    }
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество цифр в числе: ");
        int k = sc.nextInt();
        System.out.println("Введите число, сумма которого равна: ");
        int s = sc.nextInt();
        System.out.println("Таких чисел: " + sum(0, 0, k, s));
    }
}
