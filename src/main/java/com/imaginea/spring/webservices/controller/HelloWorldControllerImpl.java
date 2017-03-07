package com.imaginea.spring.webservices.controller;

import com.imaginea.spring.webservices.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by satyad on 07/03/17.
 */
@RestController
@RequestMapping("/user")
public class HelloWorldControllerImpl implements HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List greetDefaultMessage() {
        return helloWorldService.greetDefaultMessage();
    }

    @RequestMapping(value = "/greet/{name}", method = RequestMethod.GET)
    public String greetTheUser(@PathVariable String name) {
        return helloWorldService.greetTheUser(name);
    }
}
