package org.example.AbstractFactoryPattern;

public class AsusCompanyV2 extends CompanyV2{
    @Override
    public GPU createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
