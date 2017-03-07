package com.imaginea.spring.webservices.dataUtility;

import com.imaginea.spring.webservices.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by satyad on 07/11/16.
 */
@Component
public class CustomerDetailsUtil {
    private static List customers;
    {
        customers = new ArrayList();
        customers.add(new Customer(101, "John", "Doe", "djohn@gmail.com", "121-232-3435", new Date()));
        //customers.add(new Customer(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345", new Date()));
        //customers.add(new Customer(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987", new Date()));
    }

    public List list() {
        return customers;
    }
    public static void main(String a[]){
        System.out.println(customers);
        CustomerDetailsUtil d = new CustomerDetailsUtil();
        System.out.println(d.list());
    }
}
