package org.example.StrategyPattern;

public class CcPayment implements PaymentStrategy{

    CreditCard creditCard;

    @Override
    public void pay(int amount) {
        creditCard = new CreditCard();
        System.out.println("paid " + amount + " using CreditCard");
    }
}
