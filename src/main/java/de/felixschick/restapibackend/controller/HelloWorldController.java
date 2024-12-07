package de.felixschick.restapibackend.controller;

import de.felixschick.restapibackend.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping("/sayhello")
    public String sayHelloWorld(){
        System.out.println("Log: system said hello");
        return "Hello World!";
    }

    @GetMapping("/info")
    public String getSystemInformation() {
        return "$$$$$$$$\\        $$\\ $$\\                  $$$$$$\\            $$\\       $$\\           $$\\\n" +
                "$$  _____|       $$ |\\__|                $$  __$$\\           $$ |      \\__|          $$ |\n" +
                "$$ |    $$$$$$\\  $$ |$$\\ $$\\   $$\\       $$ /  \\__| $$$$$$$\\ $$$$$$$\\  $$\\  $$$$$$$\\ $$ |  $$\\\n" +
                "$$$$$\\ $$  __$$\\ $$ |$$ |\\$$\\ $$  |      \\$$$$$$\\  $$  _____|$$  __$$\\ $$ |$$  _____|$$ | $$  |\n" +
                "$$  __|$$$$$$$$ |$$ |$$ | \\$$$$  /        \\____$$\\ $$ /      $$ |  $$ |$$ |$$ /      $$$$$$  /\n" +
                "$$ |   $$   ____|$$ |$$ | $$  $$<        $$\\   $$ |$$ |      $$ |  $$ |$$ |$$ |      $$  _$$<\n" +
                "$$ |   \\$$$$$$$\\ $$ |$$ |$$  /\\$$\\       \\$$$$$$  |\\$$$$$$$\\ $$ |  $$ |$$ |\\$$$$$$$\\ $$ | \\$$\\\n" +
                "\\__|    \\_______|\\__|\\__|\\__/  \\__|       \\______/  \\_______|\\__|  \\__|\\__| \\_______|\\__|  \\__|\n + \n \n \n" +
                "Powered by software from Felix Schick under the direction of SchickTech Ltd.";
    }

    @GetMapping("/say/{whatEverYouWant}")
    public String sayWhatEverYouWant(@PathVariable String whatEverYouWant) {
        return whatEverYouWant;
    }
}
