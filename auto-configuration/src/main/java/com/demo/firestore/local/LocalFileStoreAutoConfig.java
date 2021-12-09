package com.demo.firestore.local;

import com.demo.firestore.FileStore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "file.store", havingValue =  "local")
public class LocalFileStoreAutoConfig {

    @Bean
    public FileStore fileStore(){
        return new LocalFileStore();
    }
}
