package com.imaginea.spring.webservices.services;

import com.imaginea.spring.webservices.model.GenericResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by satyad on 07/11/16.
 */
@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    public List greetDefaultMessage(){
        GenericResponse responseObj = new GenericResponse();
        responseObj.setMessage("heyyy..!");
        List<GenericResponse> response = new ArrayList<GenericResponse>();
        response.add(responseObj);
        return response;
    }

    public String greetTheUser(String name){
        return "hey "+name+"  have a good day";
    }

}
