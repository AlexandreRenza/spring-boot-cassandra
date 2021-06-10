package com.renza.springbootcassandra.controller;

import com.renza.springbootcassandra.model.Customer;
import com.renza.springbootcassandra.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Optional;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public Iterable<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }


    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/add")
    public Optional<Customer> addCustomer(@RequestBody Customer customer){
        return customerService.addNewCustomer(customer);
    }





}
