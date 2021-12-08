package com.demo.firestore.network;

import com.demo.firestore.FileStore;

public class NetWorkFileStore implements FileStore {
    @Override
    public void printFileStoreInfo() {
        System.out.println("Network File Store");

    }
}
