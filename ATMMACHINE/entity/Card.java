package ATMMACHINE.entity;

import java.util.UUID;

public class Card {

    private UUID id;
    private String cardNumber;
    private String pin;
    private Account number;

    public Card(String cardNumber, String pin, Account number) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.number = number;
    }

    public UUID getId() {
        return id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account getNumber() {
        return number;
    }
}
