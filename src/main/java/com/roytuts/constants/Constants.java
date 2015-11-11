package com.roytuts.constants;

/**
 * Created by TTTDEMIRCI on 11/11/2015.
 */
public class Constants {
    private Constants(){

    }

    public static final String SQL_NEW_CUSTOMER = "INSERT INTO CUSTOMER(CUSTOMER_NAME, CUSTOMER_CITY, CUSTOMER_STATE, CUSTOMER_ZIP_POSTAL) VALUES(?,?,?,?)";
    public static final String SQL_UPDATE_CUSTOMER = "UPDATE CUSTOMER SET CUSTOMER_NAME = ?, CUSTOMER_CITY = ?, CUSTOMER_STATE = ?, CUSTOMER_ZIP_POSTAL = ? WHERE CUSTOMER_ID = ?";
    public static final String SQL_DELETE_CUSTOMER = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = ?";
    public static final String SQL_FIND_ALL_CUSTOMERS = "SELECT * FROM CUSTOMER";
    public static final String SQL_FIND_BY_CUSTOMER_ID = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID = ?";
}
