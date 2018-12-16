package com.roman.springdemo.service;

import java.util.List;

import com.roman.springdemo.entity.Customer;

public interface CustomerService {
	public List <Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);
}
