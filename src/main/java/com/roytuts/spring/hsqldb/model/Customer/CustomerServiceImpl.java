package com.roytuts.spring.hsqldb.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by TTTDEMIRCI on 11/11/2015.
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;



    @Override
    public Customer findByCustomerId(long customerId) {
        return customerDao.findByCustomerId(customerId);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerDao.findAllCustomers();
    }

    @Override
    public void saveCustomer(Customer customer) {
    customerDao.saveCustomer(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
    customerDao.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(long customerId) {
    customerDao.deleteCustomer(customerId);
    }

    public CustomerDao getCustomerDao() {
        return customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }
}
