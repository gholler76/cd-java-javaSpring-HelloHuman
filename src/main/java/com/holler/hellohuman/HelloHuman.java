package com.holler.hellohuman;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHuman {
@RequestMapping("/coding")

	public static void main(String[] args) {
		SpringApplication.run(HelloHuman.class, args);
	}

    @RequestMapping("/{n}")
    public String index(@RequestParam(value="n", required=false) String name) {
        if (name == null) {
        	return "Hello Human!";
        } else {
        	return "Hello " + name +"!";
        }
    }	
	
}