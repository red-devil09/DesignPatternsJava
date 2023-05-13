package org.example.AbstractFactoryPattern;

public class ClientV2 {
    public static void main(String[] args) {
        //one way
        CompanyV2 companyV2 = new AsusCompanyV2();
        companyV2.assembleComp();

        System.out.println("----------");

        //second way
        CompanyV2 companyV2a = new AsusCompanyV2();
        GPU gpu = companyV2a.createGpu();
        Monitor monitor = companyV2a.createMonitor();

        gpu.assemble();
        monitor.assemble();


    }
}
