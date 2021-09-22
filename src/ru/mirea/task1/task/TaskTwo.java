package ru.mirea.task1.task;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Аргументов в командной строке: "
                + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Hello " + args[i] + "!");
        }
    }
}
