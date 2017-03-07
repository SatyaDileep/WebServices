package com.imaginea.spring.webservices.services;

import com.imaginea.spring.webservices.model.GenericResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by satyad on 07/11/16.
 */
public interface HelloWorldService {
    public List greetDefaultMessage();

    public String greetTheUser(String name);
}
