package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "banana";
        double itemPrice = 5;
        int quantity = 2;
        double total = (itemPrice * quantity);
        System.out.println("You bought " + quantity + " " + itemName + "(s) for $" + total );
    }
}