package com.roytuts.com.roytuts.mapper;

import com.roytuts.spring.hsqldb.model.Customer.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by TTTDEMIRCI on 11/11/2015.
 */
public class CustomerMapper implements org.springframework.jdbc.core.RowMapper<Customer> {


    @Override
    public Customer mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setCustomerId(rs.getLong("CUSTOMER_ID"));
        customer.setCustomerName(rs.getString("CUSTOMER_NAME"));
        customer.setCustomerCity(rs.getString("CUSTOMER_CITY"));
        customer.setCustomerState(rs.getString("CUSTOMER_STATE"));
        customer.setCustomerZip(rs.getString("CUSTOMER_ZIP_POSTAL"));
        return customer;
    }
}
