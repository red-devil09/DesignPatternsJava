package org.example.AbstractFactoryPattern;

public class AsusGpu implements GPU{
    @Override
    public void assemble() {
        System.out.println("Assembling AsusGpu");
    }
}
