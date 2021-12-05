package ru.mirea.task26;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditCard implements Strategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private DataCreditCard card;

    //Данные карты клиента
    @Override
    public void collectPaymentDetails() {
        try {
            System.out.print("Enter the card number: ");
            String number = READER.readLine();
            System.out.print("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.print("Enter the CVV code: ");
            String cvv = READER.readLine();
            card = new DataCreditCard(number, date, cvv);

            // Валидируем номер карты...

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Если карта проверена, то совершаем оплату, если клиент продолжает покупки, то карту заново не вводим
    @Override
    public boolean pay(int paymentAmount) {
        if (cardIsPresent()) {
            System.out.println("Paying " + paymentAmount + " using Credit Card.");
            card.setAmount(card.getAmount() - paymentAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean cardIsPresent() {
        return card != null;
    }
}

