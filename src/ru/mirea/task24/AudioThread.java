package ru.mirea.task24;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AudioThread implements Runnable {
    @Override
    public void run() {
        try {
            Player p = new Player(new FileInputStream("C:\\Users\\Аня\\Desktop\\уник\\java\\тачки\\weezer-you-might-think.mp3"));
            p.play();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
