package ru.mirea.task15;

import java.io.*;
import java.io.IOException;

public class text {
    public static void main(String[] args){
        try(FileWriter writer = new FileWriter("C:\\Users\\Аня\\Desktop\\file.txt", false)) {
            String line = "морской";
            writer.write(line);
            writer.append('\n');
            writer.append("кот");
            writer.flush();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

