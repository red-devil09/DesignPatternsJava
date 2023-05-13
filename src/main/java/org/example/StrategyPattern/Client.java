package org.example.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        PaymentStrategy paymentStrategy = new UpiPayment();

        //see setter injection
        //ab konsa object set krna hai, iske liye we can use factory -> lekin strategy ka kaam itna hi tha
        //setter ka zrur use kro as issi se hi runtime mei we can change things
        /**
         * Context -> payment service
         * strategy -  interface
         * UpiPayment -> concrete strategy
         * client -> to ye hai hi
         */
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.processOrderV3();
    }
}
