package com.sandeep.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.dao.ICustomerDAO;
import com.sandeep.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private ICustomerDAO customerDAO;
	
	@Override
	@Transactional //Defines @Transactional to service layer because now service layer will define start and end of transaction
	public List<Customer> getCustomers() {
		// Delegates call to DAO
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(Integer theId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(Integer theId) {
		customerDAO.deleteCustomer(theId);
	}

}
