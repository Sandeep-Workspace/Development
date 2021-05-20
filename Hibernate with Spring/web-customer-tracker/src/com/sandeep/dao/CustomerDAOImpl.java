package com.sandeep.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sandeep.entity.Customer;

@Repository
public class CustomerDAOImpl implements ICustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		
		//Get session from session Factory
		Session session = sessionFactory.getCurrentSession();
		
		//create Query
		Query<Customer> theQuery = session.createQuery("from Customer", Customer.class);
		
		//execute query
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

}
