package ru.mirea.task14;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class JPanelWithBackground extends JPanel {

    private Image backgroundImage;

    public JPanelWithBackground(String fileName) throws IOException {
        backgroundImage = ImageIO.read(new File(fileName));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
