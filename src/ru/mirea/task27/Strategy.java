package ru.mirea.task27;

public interface Strategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
