package org.example.TemplatePattern;

public abstract class BaseGameLoader {

    /**
     * this is the template method
     *
     * yaha jitne  bhi steps thee, line se likh diye sb, kisi ki default impl dedi
     * kisi ko abstract declare kr dia ki jo concrete class hai, vo apne aap implementation
     * provide kregi
     */
    public void load(){
        byte[] data = loadLocalData();
        createObjects(data);
        downLoadAdditionalFiles();
        cleanTempFiles();
        initializeProfile();
    }

    abstract byte[] loadLocalData();

    abstract void createObjects(byte[] data);

    abstract void downLoadAdditionalFiles();

    protected void cleanTempFiles(){
        System.out.println("cleaning temp files");
    }

    abstract void initializeProfile();
}
