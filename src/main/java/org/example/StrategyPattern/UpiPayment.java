package org.example.StrategyPattern;

public class UpiPayment implements PaymentStrategy{

    String UpiId;
    String phoneNumber;

    @Override
    public void pay(int amount) {
        System.out.println("paid " + amount + " using UPI");
    }
}
