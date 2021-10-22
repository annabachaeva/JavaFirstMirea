package ru.mirea.task15;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class three_text {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Аня\\Desktop\\file.txt");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String txt = in.nextLine();

        try {
            System.out.println("Файл успешно открыт");
            FileWriter fstream1 = new FileWriter("C:\\Users\\Аня\\Desktop\\file.txt");
            BufferedWriter out1 = new BufferedWriter(fstream1);
            out1.write("");
            out1.close();

            FileOutputStream output = new FileOutputStream(file);
            byte[] buf = txt.getBytes();
            output.write(buf,0,buf.length);
            output.close();
            System.out.println("Файл изменен");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}