package com.unimelb.swen30006.workshops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.onboard();
        while (true) {
            System.out.println("Enter command (activate, suspend, update, close, exit):");
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            switch (command) {
                case "activate":
                    account.activate();
                    break;
                case "suspend":
                    account.suspend();
                    break;
                case "update":
                    account.update();
                    break;
                case "close":
                    account.close();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
