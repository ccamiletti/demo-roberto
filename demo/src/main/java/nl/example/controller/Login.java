package nl.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/login")
public class Login {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable("name") String name){
        return String.format("Hi %s", name);
    }

}
