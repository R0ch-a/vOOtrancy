package com.vootrancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.vootrancy")
public class VooTrancyApplication {
    public static void main(String[] args) {
        SpringApplication.run(VooTrancyApplication.class, args);
    }
}
