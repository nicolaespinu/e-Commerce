package com.spinic.eshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(EShopApplication.class, args);
        Logger log = LoggerFactory.getLogger(EShopApplication.class);
        log.info("=============================");
        log.info("=============================");
        log.info("=============================");
    }
}
