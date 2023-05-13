package org.example.AbstractFactoryPattern;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("assembling MSI monitor");
    }
}
