package ru.mirea.Wheelbarrows;

import java.io.Serializable;
import java.util.Arrays;

public class SavedGame implements Serializable {

    private static final long serialVersionUID = 1L;

    private String[] playInfo;

    public SavedGame(String[] playInfo){
        this.playInfo = playInfo;
    }

    public String[] getPlayInfo() {
        return playInfo;
    }

    public void setPlayInfo(String[] territoriesInfo) {
        this.playInfo = territoriesInfo;
    }

    @Override
    public String toString() {
        return "SavedGame{" +
                "playInfo = " + Arrays.toString(playInfo) +
                '}';
    }
}
