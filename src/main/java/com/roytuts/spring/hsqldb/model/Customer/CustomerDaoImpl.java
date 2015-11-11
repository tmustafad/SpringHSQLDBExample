package com.roytuts.spring.hsqldb.model.Customer;
import com.roytuts.com.roytuts.mapper.CustomerMapper;
import com.roytuts.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import  com.roytuts.constants.Constants.*;
import java.util.List;

import static com.roytuts.constants.Constants.*;

/**
 * Created by TTTDEMIRCI on 11/11/2015.
 */

public class CustomerDaoImpl implements  CustomerDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Customer findByCustomerId(Long customerId) {

        Customer customer=jdbcTemplate.queryForObject(SQL_FIND_BY_CUSTOMER_ID,new CustomerMapper(),
                new Object[] { customerId });
        return  customer;
    }

    @Override
    public List<Customer> findAllCustomers() {
        List<Customer> customers=jdbcTemplate.query(SQL_FIND_ALL_CUSTOMERS,new CustomerMapper());
        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {
        jdbcTemplate.update(SQL_NEW_CUSTOMER,new Object[]{customer.getCustomerName(),customer.getCustomerCity(),customer.getCustomerState(),customer.getCustomerZip()});

    }

    @Override
    public void updateCustomer(Customer customer) {
        jdbcTemplate.update(
                SQL_UPDATE_CUSTOMER,
                new Object[] { customer.getCustomerName(),
                        customer.getCustomerCity(),
                        customer.getCustomerState(), customer.getCustomerZip(),
                        customer.getCustomerId() });
    }

    @Override
    public void deleteCustomer(Long customerId) {
        jdbcTemplate.update(SQL_DELETE_CUSTOMER,new Object[]{customerId});
    }


}
