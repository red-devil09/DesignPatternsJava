package org.example.TemplatePattern;

public class Client {
    public static void main(String[] args) {
        BaseGameLoader gameLoader = new NFSLoaderV2();
        gameLoader.load();

        /**
         * BaseGameLoader -> abstract class
         * NFSLoaderV2 - Concrete class
         **/
    }
}
