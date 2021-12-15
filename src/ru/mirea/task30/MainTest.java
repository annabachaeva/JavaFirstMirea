package ru.mirea.task30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        String regex = "^[A-za-z\\s]+!$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher("Игрок это молния!");
        Matcher matcher_1 = pattern.matcher("The enemy is green cars!");
    }
}