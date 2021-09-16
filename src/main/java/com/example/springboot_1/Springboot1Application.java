package com.example.springboot_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot1Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Springboot1Application.class, args);

    }

}
