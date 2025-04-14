package com.unimelb.swen30006.workshops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Account {
    private Map<UUID, CreditCard> creditCards;
    private boolean active;

    public Account() {
        this.creditCards = new HashMap<>();
        this.active = false;
    }

    public void onboard() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        System.out.println("Enter Customer name:");
        String name = sc.nextLine();
        //Generate Card Number following MasterCard format
        String cardNumber = "5" + (int)(Math.random() * 100000000000000L);
        //Generate Expiry Date
        String expiryDate = (int)(Math.random() * 12) + "/" + (int)(Math.random() * 10 + 2023);
        //Generate CVV
        String cvv = String.valueOf((int)(Math.random() * 1000));
        //Create Credit Card
        CreditCard creditCard = new CreditCard(cardNumber, name, expiryDate, cvv, State.PENDING);
        //Add Credit Card to Map
        creditCards.put(uuid, creditCard);
        System.out.println("Credit Card created with UUID: " + uuid);
        System.out.println("Current state: " + creditCard.getState());
    }
    public void suspend() {

    }
    public void activate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UUID of Credit Card to activate:");
        String uuidString = sc.nextLine();
        UUID uuid = UUID.fromString(uuidString);
        if (creditCards.containsKey(uuid)) {
            CreditCard creditCard = creditCards.get(uuid);
            creditCard.setState(State.ACTIVE);
            System.out.println("Credit Card activated.");
        }
        else {
            System.out.println("Credit Card not found.");
        }

    }
    public void update() {

    }
    public void close() {

    }
}
