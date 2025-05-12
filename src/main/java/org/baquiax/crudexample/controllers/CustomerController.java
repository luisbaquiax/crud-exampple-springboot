package org.baquiax.crudexample.controllers;

import org.baquiax.crudexample.models.Customer;
import org.baquiax.crudexample.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer saverCustomer(@RequestBody Customer customer) {
        return customerService.saverCustomer(customer);
    }
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAll();
    }
}
