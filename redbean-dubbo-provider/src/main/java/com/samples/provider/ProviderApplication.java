package com.samples.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class ProviderApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProviderApplication.class, args);
  }
}
