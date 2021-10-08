package ru.mirea.task8.task2;

import ru.mirea.task8.task1.Window;

import java.awt.*;
import java.io.*;
import java.util.Scanner;
import javax.imageio.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.IOException;

public class Image_class extends JPanel {
    private Image image;
    private String path;
    public Image_class()
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            path = "C:\\Users\\Аня\\Desktop\\IMG_20210701_211141.jpg";
            image = ImageIO.read(new File(path));
            image = image.getScaledInstance(400,400,Image.SCALE_SMOOTH);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    public void paintComponent(Graphics p)
    {
        super.paintComponent(p);
        p.drawImage(image,10,10,null);
    }
}

