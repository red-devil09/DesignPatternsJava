package org.example.AbstractFactoryPattern;

public abstract class Company {

    /**
     * so kis type ke gpu ka assemble method call krna hai, uske liye factory method
     */
    public GPU assemble(){
        GPU gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract GPU createGpu();
}
