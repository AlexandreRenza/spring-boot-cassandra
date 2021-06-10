package com.renza.springbootcassandra.repository;

import com.renza.springbootcassandra.model.Customer;
import org.springframework.data.repository.CrudRepository;
import java.io.Serializable;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {


}
