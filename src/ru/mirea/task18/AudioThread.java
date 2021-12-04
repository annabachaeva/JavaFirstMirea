package ru.mirea.task18;

//package ru.mirea.Wheelbarrows;

import javazoom.jl.decoder.JavaLayerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.player.Player;

//использование исключений в проекте, для использования аудиофайла
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