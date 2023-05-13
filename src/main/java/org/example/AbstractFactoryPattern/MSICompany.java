package org.example.AbstractFactoryPattern;

public class MSICompany extends Company{
    @Override
    public GPU createGpu() {
        return new MSIGpu();
    }
}
