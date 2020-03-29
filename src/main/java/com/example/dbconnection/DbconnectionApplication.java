package com.example.dbconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// JPA 활성화를 위한 어노테이션이다.
@EnableJpaAuditing
@SpringBootApplication
public class DbconnectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbconnectionApplication.class, args);
    }

}
