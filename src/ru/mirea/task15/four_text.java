package ru.mirea.task15;

import java.io.*;
import java.util.Scanner;

public class four_text {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Аня\\Desktop\\file.txt";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String text = in.nextLine();

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(text);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}
