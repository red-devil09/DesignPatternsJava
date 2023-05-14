package org.example.TemplatePattern;

import com.sun.security.jgss.GSSUtil;

public class NFSLoaderV2 extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("creating NFS objects");
    }

    @Override
    void downLoadAdditionalFiles() {
        System.out.println("downloading NFS files");
    }

    @Override
    void initializeProfile() {
        System.out.println("initializing NFS profiles");
    }
}
