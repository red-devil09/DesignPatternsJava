package org.example.AbstractFactoryPattern;

public class MSIGpu implements GPU{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI gpu");
    }
}
