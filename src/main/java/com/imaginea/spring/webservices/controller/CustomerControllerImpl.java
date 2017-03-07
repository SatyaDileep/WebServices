package com.imaginea.spring.webservices.controller;

import com.imaginea.spring.webservices.dataUtility.CustomerDetailsUtil;
import com.imaginea.spring.webservices.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by satyad on 07/11/16.
 */
@RestController
@RequestMapping("/customer")
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/allCustomers", method = RequestMethod.GET)
    public List getCustomers() {
        return customerService.getCustomers();
    }
}
