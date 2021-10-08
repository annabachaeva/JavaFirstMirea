package ru.mirea.task8.task2;

import ru.mirea.task8.task1.Draw;

import javax.swing.*;

public class Window extends JFrame {
    public Window()
    {
        super("Image");
        add(new Image_class());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        Window window = new Window();
    }
}
