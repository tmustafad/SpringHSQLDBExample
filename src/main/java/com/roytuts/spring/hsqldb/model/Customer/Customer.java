package com.roytuts.spring.hsqldb.model.Customer;
        ;

/**
 * Created by TTTDEMIRCI on 11/11/2015.
 */
public class Customer {

    private Long customerId;
    private String customerName;
    private String customerCity;
    private String customerState;
    private String customerZip;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip;
    }
}
