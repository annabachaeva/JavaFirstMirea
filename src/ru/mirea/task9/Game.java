package ru.mirea.task9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame {

    private int First_Command;
    private int Second_Command;
    private String First_Name;
    private String Second_Name;
    private String LastSoccer;
    public String isWinner()
    {
        if (this.First_Command > this.Second_Command)
        {
            return this.First_Name;
        }
        else if (this.First_Command < this.Second_Command)
        {
            return this.Second_Name;
        }
        else
        {
            return "Draw!";
        }
    }
    //JTextField score = new JTextField(10);

    public Game()
    {
        super("Game");
        setLayout(new GridLayout(3,1));
        JPanel[] pnl = new JPanel[3];
        for(int i = 0 ; i < pnl.length ; i++)
        {
            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        this.First_Name = "Spain";
        this.Second_Name = "England";
        this.Second_Command = 0;
        //this.SecondCommandGoals = 0;
        JButton FirstCommand = new JButton(this.First_Name + " gols!");
        JButton SecondCommand = new JButton(this.Second_Name + " gols!");
        JLabel score = new JLabel(this.First_Command + " X " + this.Second_Command);
        //JLabel LstScr = new JLabel("Last Soccer: N/A");
        JLabel Wnr = new JLabel("Winner: " + isWinner());
        score.setFont(new Font("Times new Roman", Font.BOLD,40));
        //LstScr.setFont(new Font("Times new Roman", Font.BOLD,20));
        Wnr.setFont(new Font("Times new Roman", Font.BOLD,20));
        setSize(400,400);
        pnl[0].setLayout(new BorderLayout());
        score.setHorizontalAlignment(SwingConstants.CENTER);
        pnl[0].add(score, BorderLayout.CENTER);
        FirstCommand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                First_Command++;
                LastSoccer = First_Name;
                score.setText(First_Command + " X " + Second_Command);
                //LstScr.setText("Last Soccer: " + LastSoccer);
                Wnr.setText("Winner: " + isWinner());
            }
        });
        SecondCommand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Second_Command++;
                LastSoccer = Second_Name;
                score.setText(First_Command + " x " + Second_Command);
                //LstScr.setText("Last Soccer: " + LastSoccer);
                Wnr.setText("Winner: " + isWinner());
            }
        });
        pnl[1].setLayout(new GridLayout(3,1));
        JPanel[] p = new JPanel[3];
        for (int i = 0; i < p.length; i++)
        {
            p[i] = new JPanel();
            pnl[1].add(p[i]);
        }
        p[1].setLayout(new FlowLayout());
        FirstCommand.setPreferredSize(new Dimension(150,35));
        SecondCommand.setPreferredSize(new Dimension(150,35));
        p[1].add(FirstCommand);
        p[1].add(SecondCommand);
        pnl[2].setLayout(new BorderLayout());
        //LstScr.setHorizontalAlignment(SwingConstants.CENTER);
        //pnl[2].add(LstScr,BorderLayout.CENTER);
        pnl[2].setLayout(new BorderLayout());
        Wnr.setHorizontalAlignment(SwingConstants.CENTER);
        pnl[2].add(Wnr,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args)
    {
        Game example = new Game();
    }
}
