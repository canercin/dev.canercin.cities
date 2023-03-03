package com.springdemo.springbootrefresh;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/canersel")
    public String canersel() {
        return "lord of the codess!";
    }
}
