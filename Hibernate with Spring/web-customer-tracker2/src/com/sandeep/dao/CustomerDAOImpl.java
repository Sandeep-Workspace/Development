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
	public List<Customer> getCustomers() {
		
		//Get session from session Factory
		Session session = sessionFactory.getCurrentSession();
		
		//create Query
		Query<Customer> theQuery = session.createQuery("from Customer order by lastName", Customer.class);
		
		//execute query
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(theCustomer);
		
	}

	@Override
	public Customer getCustomer(Integer theId) {
		Session session = sessionFactory.getCurrentSession();
		
		return session.get(Customer.class,theId);
	}

	@Override
	public void deleteCustomer(Integer theId) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		
		Query<Customer> query =session.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId",theId);
		System.out.println(query.executeUpdate());
	}

}
