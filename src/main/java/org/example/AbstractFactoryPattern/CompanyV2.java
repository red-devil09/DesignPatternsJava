package org.example.AbstractFactoryPattern;

public abstract class CompanyV2 {

    public void assembleComp(){
        Monitor monitor = createMonitor();
        GPU gpu = createGpu();

        monitor.assemble();
        gpu.assemble();
    }

    public abstract GPU createGpu();

    public abstract Monitor createMonitor();
}
