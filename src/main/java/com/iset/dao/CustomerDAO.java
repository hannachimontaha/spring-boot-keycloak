package com.iset.dao;

import org.springframework.data.repository.CrudRepository;

import com.iset.entities.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
