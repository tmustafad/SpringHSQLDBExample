package com.roytuts.spring.hsqldb.model.Customer;


import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/11/2015.
 */



public interface CustomerDao {

    Customer findByCustomerId(Long customerId);
    List<Customer> findAllCustomers();
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Long customerId);


}
