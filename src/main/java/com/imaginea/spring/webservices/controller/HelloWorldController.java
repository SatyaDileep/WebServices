package com.imaginea.spring.webservices.controller;

import java.util.List;

/**
 * Created by satyad on 07/03/17.
 */
public interface HelloWorldController {
    public List greetDefaultMessage();

    public String greetTheUser(String name);
}
