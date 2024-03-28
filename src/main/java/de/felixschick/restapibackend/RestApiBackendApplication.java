package de.felixschick.restapibackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class RestApiBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiBackendApplication.class, args);
    }

}
