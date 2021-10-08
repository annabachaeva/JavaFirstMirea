package ru.mirea.task8.task3;

/*import ru.mirea.task8.Shape.Window;*/

import java.awt.*;
import java.io.*;
import java.util.Scanner;
import javax.imageio.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.TimerTask;
import java.util.Timer;

public class Image_class extends JPanel {
    private Image image;
    private Image image1;
    public Image_class() {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int k = 0;
            @Override
            public void run() {
                try {
                    switch (k) {
                        case 0:
                            image1 = ImageIO.read(new File("C:\\Users\\Аня\\Desktop\\UaoMzMwcuUc.jpg"));
                            break;
                        case 1:
                            image1 = ImageIO.read(new File("C:\\Users\\Аня\\Desktop\\wv9TSeQiWzo.jpg"));
                            break;
                        case 2:
                            image1 = ImageIO.read(new File("C:\\Users\\Аня\\Desktop\\6qh2Bmg2i3k.jpg"));
                            break;
                        /*case 3:
                            image1 = ImageIO.read(new File("C:\\Users\\Аня\\Desktop\\UaoMzMwcuUc.jpg"));
                            break;
                        case 4:
                            image1 = ImageIO.read(new File("C:\\Users\\Den\\IdeaProjects\\JavaFirstMirea\\src\\images\\Снимок4.PNG"));
                            break;*/
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
                image1 = image1.getScaledInstance(800, 800, Image.SCALE_SMOOTH);
                k++;
                if (k == 5)
                {
                    k = 0;
                }
                repaint();
            }
        };
        timer.schedule(task,3,600);
    }
    public void paintComponent(Graphics p)
    {
        super.paintComponent(p);
        //p.drawImage(image1,150,150,null);
        p.drawImage(image1,0,0,null);
    }
}
