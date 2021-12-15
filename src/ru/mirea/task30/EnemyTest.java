package ru.mirea.task30;

import org.junit.jupiter.api.Test;
import ru.mirea.task28.Road;

import javax.swing.*;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    public static final int MAX_TOP_EN = 200; //верхняя часть экрана, выше которой машинка не будет подниматься
    public static final int MAX_BOTTOM_EN = 450; //предельная координата относительно нижнего края экрана

    int x;
    int y;
    int dy = 0;
    int v;
    Image img = new ImageIcon("C:\\Users\\Аня\\Desktop\\уник\\java\\тачки\\enemy.png").getImage();
    Road road;

    @Test
    void getRect() {
    }

    @Test
    void move() {
        x = x - road.p.v + v;
        y -= dy;
        if (y <= MAX_TOP_EN) y = MAX_TOP_EN;
        if (y >= MAX_BOTTOM_EN) y = MAX_BOTTOM_EN;
    }
}