package com.istic.fr.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.istic.fr.services.CreatorInfoService;

@Configuration
public class CreatorServiceConfiguration {

    @Bean
    @ConditionalOnProperty("user")
    public CreatorInfoService creatorInfoService(){
        return new CreatorInfoService();
    }

}
