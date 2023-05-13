package org.example.StrategyPattern;

public class PaymentService {
    private int cost;
    private boolean includeDelivery;

    private int getTotalAmount(){
        return includeDelivery?cost+10:cost;
    }

    /**
     * problem is, what if we have different types of payment strategies : UPI,debitCard etc
     */
    public void processOrder(){
        //collect card details
        CreditCard creditCard = new CreditCard();
        System.out.println("paying " + getTotalAmount() + " using credit card");
    }


    /**
     * yaha mai ab confuse ho gya, as factory bhi ekdum same hi lgta hai
      * to mera solution ye factory se hi hoga, ki 2 payment service bnao iksi child
     * credit card and UPI
     * process order mei ek object create kro, payment method ka
     * and client will create object of either UPIPaymentService or CreditCardPaymentService
     * UPIPaymentService will create object of UPI
     * CreditCardPaymentService will create object of CreditCard
     *
     * UPI and CreditCard both have one method of processPayment, so will finally call that
     */
    public void processOrderV2(String paymentMethod){
        if("creditCard".equals(paymentMethod)){
            CreditCard creditCard = new CreditCard();
            System.out.println("paying " + getTotalAmount() + " using credit card");
        }else if("upi".equals(paymentMethod)){
            //upi paymnet ka object and uska code
        }

    }

    /**
     * bs ye neeche wala code strategy ka hai, client paymentStrategy ko
     * setter injection se set kr dega
     */

    private PaymentStrategy paymentStrategy;

    public void processOrderV3(){
        this.cost = 100;
        paymentStrategy.pay(getTotalAmount());
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
