package com.istic.fr.configuration;

import com.istic.fr.services.DatabaseFillingService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseFillingConfiguration {


    @ConditionalOnProperty("spring.datasource.initialize")
    public DatabaseFillingService databaseFillingService(){
        return new DatabaseFillingService();
    }
}
