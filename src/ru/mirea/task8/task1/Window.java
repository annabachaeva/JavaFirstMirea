package ru.mirea.task8.task1;

import javax.swing.*;

public class Window extends JFrame {
    static private int width;
    static private int length;
    public Window()
    {
        super("Shapes");
        this.width = 600;
        this.length = 600;
        setSize(width,length);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Draw(width,length));
    }
    public static void main(String[]args)
    {
        Window test = new Window();
    }
}
