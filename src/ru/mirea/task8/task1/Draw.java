package ru.mirea.task8.task1;

import java.awt.*;
import javax.swing.*;

public class Draw extends JPanel {
    private int width;
    private int length;
    public void paintComponent(Graphics p) {
        int generated_number;
        for (int i = 0; i < 20; i++) {
            generated_number = (int) (Math.random() * 4);
            switch (generated_number) {
                case 0:
                    Rectangle ob = new Rectangle();
                    p.setColor(new Color(ob.getRColor(), ob.getGColor(), ob.getBColor()));
                    ob.setX(ob.getWidth(), width);
                    ob.setY(ob.getLength(),length);
                    p.fillRect(ob.getX(), ob.getY(), ob.getWidth(), ob.getLength());
                    break;
                case 1:
                    Circle ob1 = new Circle();
                    p.setColor(new Color(ob1.getRColor(), ob1.getGColor(), ob1.getBColor()));
                    ob1.setX(ob1.getRadius(),width);
                    ob1.setY(ob1.getRadius(),length);
                    p.fillOval(ob1.getX(), ob1.getY(), ob1.getRadius(), ob1.getRadius());
                    break;
            }
        }
    }
    public Draw(int width, int length) {
        this.width = width;
        this.length = length;
    }
}


