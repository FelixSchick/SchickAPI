package de.felixschick.restapibackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/sayhello")
    public String sayHelloWorld(){
        System.out.println("Log: system said hello");
        return "Hello World!";
    }

    @GetMapping("/say/{whatEverYouWant}")
    public String sayWhatEverYouWant(@PathVariable String whatEverYouWant) {
        return whatEverYouWant;
    }
}
