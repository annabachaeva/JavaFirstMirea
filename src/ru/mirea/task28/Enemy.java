package ru.mirea.task28;

import javax.swing.*;
import java.awt.*;

public class Enemy {
    public static final int MAX_TOP_EN = 200; //верхняя часть экрана, выше которой машинка не будет подниматься
    public static final int MAX_BOTTOM_EN = 450; //предельная координата относительно нижнего края экрана

    int x;
    int y;
    int dy = 0;
    int v;

    Image img = new ImageIcon("C:\\Users\\Аня\\Desktop\\уник\\java\\тачки\\enemy.png").getImage();
    Road road;

    public Rectangle getRect() {
        return new Rectangle(x, y, 156, 60);
    }

    public Enemy(int x, int y, int v, Road road) {
        this.x = x;
        this.y = y;
        this.v = v;
        this.road = road;
    }

    public void move() {
        x = x - road.p.v + v;
        y -= dy;
        if (y <= MAX_TOP_EN) y = MAX_TOP_EN;
        if (y >= MAX_BOTTOM_EN) y = MAX_BOTTOM_EN;
    }
}
