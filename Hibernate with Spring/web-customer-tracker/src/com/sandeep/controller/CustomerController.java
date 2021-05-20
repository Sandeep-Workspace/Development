package com.sandeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sandeep.dao.ICustomerDAO;
import com.sandeep.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerDAO customerDao;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		//fetch Customers from DAO
		List<Customer> theCustomers = customerDao.getCustomers();
		
		//add customers into model
		theModel.addAttribute("customers", theCustomers);
		
		return "list-customers";
	}
}
