package org.baquiax.crudexample.services;

import org.baquiax.crudexample.models.Customer;
import org.baquiax.crudexample.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saverCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    public ArrayList<Customer> findAll() {
        return (ArrayList<Customer>) customerRepository.findAll();
    }
}
