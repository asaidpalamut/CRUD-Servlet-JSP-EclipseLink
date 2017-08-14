package com.example.service;

import com.example.dao.CustomerDAO;
import com.example.dao.CustomerDAOImpl;
import com.example.dao.GenericDAOImpl;
import com.example.model.Customer;

public class CustomerServiceImpl extends GenericDAOImpl<Customer> implements CustomerService{

	public CustomerDAO customerDAO;
	
	public CustomerServiceImpl() {
		customerDAO = new CustomerDAOImpl();
	}
	
}
