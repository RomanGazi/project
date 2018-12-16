package com.roman.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.roman.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	//inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		//get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
	
		//create a query
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by firstName", Customer.class);
		
		//execute query
		List<Customer> customers = theQuery.getResultList();
		
		//return results
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// get hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//save customer
		currentSession.save(theCustomer);
	}
	
	
}
