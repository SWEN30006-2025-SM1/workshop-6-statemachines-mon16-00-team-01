package com.unimelb.swen30006.workshops;

public class CreditCard {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    private State state;

    public CreditCard(String cardNumber, String cardHolderName, String expiryDate, String cvv, State state) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.state = state;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState(State newState) {
        this.state = newState;
        System.out.println("State changed to " + newState);
    }
}
