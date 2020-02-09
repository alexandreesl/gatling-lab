package com.alexandreesl.gatling.demo.gatlinglab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class GatlingLabApplication {

  public static void main(String[] args) {
    SpringApplication.run(GatlingLabApplication.class, args);
  }
}
