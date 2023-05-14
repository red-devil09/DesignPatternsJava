package org.example.TemplatePattern;

public class Intuition {
}

class NFSLoader{
    public void load(){
        System.out.println("loading local NFS file");

        System.out.println("Creating NFS objects");

        System.out.println("Downloading NFS sounds and videos");

        System.out.println("Cleaning temp files");

        System.out.println("Loading NFS saved profiles");
    }
}

/**
 * we can see in both the games, there is a algorithm Load
 * method, is broken into series of Steps and that order remains same for both the games
 * while the step may behave same or different in both concrete games,
 *
 * hence just create a template method for that Load method with all the steps(steps are series of functions
 * which will be called in an order)(can be abstract or may provide default impl)
 */

class TODLoader{
    public void load(){
        System.out.println("loading local TOD file");

        System.out.println("Creating TOD objects");

        System.out.println("Downloading TOD sounds and videos");

        System.out.println("Cleaning temp files");

        System.out.println("Loading TOD saved profiles");
    }
}
