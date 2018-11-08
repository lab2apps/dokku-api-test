package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/lol")
    public Greeting lol(){
        return new Greeting(34, "dfdf");
    }
}
