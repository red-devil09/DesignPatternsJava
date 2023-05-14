package org.example.ChainOfResponsibility.Way1;

public class Client {

    public static void main(String args[]) {

        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this ");
        logObject.log(LogProcessor.INFO, "just for info ");
        /**
         * yaha seekhne ki ek chiz bohot mst hai
         * "log" method parent mei bhi hai, or base class mei bhi
         *
         * dono mei thods alag hai, to pehle hum base class ke "log" method ko call kr rhe hai
         * fir koi condition rkh kr, super class ke log method ko call kr rhe hai
         *
         * super class ka log method fir next handler ko call kr rha h
         */

    }
}
