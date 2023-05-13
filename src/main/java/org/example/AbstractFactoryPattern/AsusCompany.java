package org.example.AbstractFactoryPattern;

public class AsusCompany extends Company{
    @Override
    public GPU createGpu() {
        return new AsusGpu();
    }
}
