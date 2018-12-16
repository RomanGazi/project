package com.roman.springdemo.dao;

import java.util.List;

import com.roman.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);
}
