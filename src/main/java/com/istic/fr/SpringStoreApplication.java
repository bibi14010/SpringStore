package com.istic.fr;

import com.istic.fr.services.DatabaseFillingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import com.istic.fr.services.CreatorInfoService;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@Slf4j
@ComponentScan("com.istic.fr")
@EntityScan(basePackages ="com.istic.fr.entities")
public class SpringStoreApplication implements CommandLineRunner {

    @Autowired
    private CreatorInfoService creatorInfoService;
    @Autowired
    private DatabaseFillingService databaseFillingService;

    @Override
    public void run(String... args){

        log.info(creatorInfoService.getMessage());
        databaseFillingService.fillDatabase();
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(SpringStoreApplication.class,args);
    }

}
