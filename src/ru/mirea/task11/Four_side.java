package ru.mirea.task11;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Four_side {
    public static void main(String[] args) {
        JFrame root = new JFrame();

        root.setDefaultCloseOperation( EXIT_ON_CLOSE );
        root.setSize(250, 250);
        Container container = root.getContentPane();

        JLabel north = new JLabel("Север" );
        north.setHorizontalAlignment(JLabel.CENTER);
        north.setBorder(BorderFactory.createLineBorder(Color.black));
        north.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(north, "Добро пожаловать на Север");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel east = new JLabel("Восток" );
        east.setHorizontalAlignment(JLabel.CENTER);
        east.setBorder(BorderFactory.createLineBorder(Color.black));
        east.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(east, "Добро пожаловать на Восток");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel south = new JLabel("Юг" );
        south.setHorizontalAlignment(JLabel.CENTER);
        south.setBorder(BorderFactory.createLineBorder(Color.black));
        south.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(south, "Добро пожаловать на Юг");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel west = new JLabel("Запад" );
        west.setHorizontalAlignment(JLabel.CENTER);
        west.setBorder(BorderFactory.createLineBorder(Color.black));
        west.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(west, "Добро пожаловать на Запад");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        JLabel center = new JLabel("Центр" );
        center.setHorizontalAlignment(JLabel.CENTER);
        center.setBorder(BorderFactory.createLineBorder(Color.black));
        center.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(center, "Добро пожаловать в Центр");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        container.add(north, BorderLayout.NORTH);
        container.add(east, BorderLayout.EAST);
        container.add(south, BorderLayout.SOUTH);
        container.add(west, BorderLayout.WEST);
        container.add(center);
        // Открываем окно
        root.pack();
        root.setLocationRelativeTo(null);
        root.setSize(500,500);
        root.setVisible(true);
    }
}
