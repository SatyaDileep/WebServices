package com.imaginea.spring.webservices.services;

import com.imaginea.spring.webservices.dataUtility.CustomerDetailsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by satyad on 11/11/16.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDetailsUtil customerDetailsUtil;

    public List getCustomers() {
        return customerDetailsUtil.list();
    }

    //@Test
}