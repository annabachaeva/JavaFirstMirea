package ru.mirea.task14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class GameLinked {
    private static final int NUMBER_OF_CARDS = 10;
    private static final Scanner reader = new Scanner(System.in);

    public static void run() throws FileNotFoundException {
        Scanner reader = new Scanner(new FileInputStream("C:\\Users\\Аня\\Desktop\\card.txt"));
        List<Integer> firstPlayerCards = new LinkedList<>();
        List<Integer> secondPlayerCards = new LinkedList<>();
        String[] playerOneDeck = reader.nextLine().split(" ");
        String[] playerTwoDeck = reader.nextLine().split(" ");
        reader.close();
        for (int i = 0; i < playerOneDeck.length; ++i) {
            firstPlayerCards.add(Integer.parseInt(playerOneDeck[i]));
        }
        for (int i = 0; i < playerTwoDeck.length; ++i) {
            secondPlayerCards.add(Integer.parseInt(playerTwoDeck[i]));
        }
        int turnCount = 0;
        while (!firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            if (turnCount >= 106) {
                System.out.println("botva");
                break;
            }
            int firstPlayerCard = firstPlayerCards.remove(0);
            int secondPlayerCard = secondPlayerCards.remove(0);
            if (firstPlayerCard == NUMBER_OF_CARDS - 1 && secondPlayerCard == 0){
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }
            else
            if (firstPlayerCard == 0 && secondPlayerCard == NUMBER_OF_CARDS - 1){
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            }
            else
            if (firstPlayerCard < secondPlayerCard) {
                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
            }
            else {
                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
            }
            ++turnCount;
        }
        if (firstPlayerCards.isEmpty()) {
            System.out.println("second " + turnCount);
        } else if (secondPlayerCards.isEmpty()) {
            System.out.println("first " + turnCount);
        }
    }
}
