package com.demo.firestore.network;

import com.demo.firestore.FileStore;
import com.demo.firestore.local.LocalFileStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "file.store", havingValue = "network")
public class NetWorkFileStoreAutoConfig {

    @Bean
    public FileStore fileStore(){
        return new NetWorkFileStore();
    }
}


