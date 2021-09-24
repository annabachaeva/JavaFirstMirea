package ru.mirea.task6;

public class Price implements Priceable {
    public void getPrice() {
        System.out.println("Price milk 50ru");
    }
    public static void main(String[] args) {
        Price p1 = new Price();
        p1.getPrice();
    }
}