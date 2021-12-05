package ru.mirea.task24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Road extends JPanel implements ActionListener, Runnable {

    Timer mainTimer = new Timer(20, this); //запускает функция каждые 20 милисекунд

    Image img = new ImageIcon("C:\\Users\\Аня\\Desktop\\уник\\java\\тачки\\background.jpg").getImage();

    Player p = new Player();

    Thread enemiesFactory = new Thread(this);
    Thread audioThread = new Thread(new AudioThread());

    List<Enemy> enemies = new ArrayList<Enemy>();
    

    public Road() {
        mainTimer.start();
        enemiesFactory.start();
        audioThread.start();
        addKeyListener(new myKeyAdapter());
        setFocusable(true);
    }

    private class myKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            p.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e) {
            p.keyReleased(e);
        }
    }
    public void paint(Graphics g) {
        g = (Graphics2D) g;
        g.drawImage(img, p.layer1, 0, null);
        g.drawImage(img, p.layer2, 0, null);
        g.drawImage(p.img, p.x, p.y, null);

        Iterator<Enemy> i = enemies.iterator();
        while(i.hasNext()) {
            Enemy e = i.next();
            if (e.x >= 2400 || e.x <= -2400) {
                i.remove();
            }
            else {
                e.move();
                g.drawImage(e.img, e.x, e.y, null);
            }
        }

        double v = (200 / Player.MAX_V) * p.v;
        g.setColor(Color.WHITE);
        Font font = new Font("Comic Sans MS", Font.BOLD, 20);
        g.setFont(font);
        g.drawString("Скорость: " + v + " км/ч", 100, 30);

    }

    public void actionPerformed(ActionEvent e) {
        p.move();
        repaint();
        testCollisionWithEnemies();
        testWin();
    }

    private void testWin() {
        if (p.s > 50000) {
            JOptionPane.showMessageDialog(null, "Вы выиграли!!!");
            System.exit(0);
        }
    }

    private void testCollisionWithEnemies() {
        Iterator<Enemy> i = enemies.iterator();
        while (i.hasNext()){
            Enemy e = i.next();
            if (p.getRect().intersects(e.getRect())) { //проверка столкновений игрока и врага
                JOptionPane.showMessageDialog(null, "Вы проиграли...");
                System.exit(1);
            }
        }
    }
    @Override
    public void run() {
        while(true) {
            Random rand = new Random();
            try {
                Thread.sleep(rand.nextInt(2000));
                enemies.add(new Enemy(1200, rand.nextInt(600), rand.nextInt(50), this));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

