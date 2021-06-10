package com.renza.springbootcassandra.service;

import com.renza.springbootcassandra.model.Customer;
import com.renza.springbootcassandra.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.io.Serializable;

import java.util.Optional;

@Service
public class CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }


    public Optional<Customer> getCustomerById(int id){
        return customerRepository.findById(id);
    }

    public Optional<Customer> addNewCustomer(Customer customer){

        customerRepository.save(customer);

        return customerRepository.findById(customer.getId());

    }


}
