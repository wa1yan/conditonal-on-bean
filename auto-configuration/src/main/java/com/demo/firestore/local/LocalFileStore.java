package com.demo.firestore.local;


import com.demo.firestore.FileStore;

public class LocalFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Local file store");
    }
}
