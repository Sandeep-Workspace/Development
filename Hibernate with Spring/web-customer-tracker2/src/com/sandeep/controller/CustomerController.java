package com.sandeep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sandeep.entity.Customer;
import com.sandeep.services.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		/*fetch Customers from DAO*/		List<Customer> theCustomers = customerService.getCustomers();
		/*add customers into model*/		theModel.addAttribute("customers", theCustomers);
		return "list-customers";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		/* create Customer Object*/		    Customer theCustomer =new Customer();
		/*add object to Model Attribute */	theModel.addAttribute("customer",theCustomer);
		return "customer-form";
	}

	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
		System.out.println("Id:"+theCustomer.getId());
		customerService.saveCustomer(theCustomer);
		return "redirect:/customer/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") Integer theId, Model theModel) {
		/*fetching Customer Object*/										Customer theCustomer = customerService.getCustomer(theId);
		/*Adding Customer to Model Attribute to supply it on jsp page*/		theModel.addAttribute("customer", theCustomer);
		return "customer-form";
	}

	@GetMapping("/delete/{customerId}")
	public String deleteCustomer(@RequestParam("customerId") Integer theId) {
		customerService.deleteCustomer(theId);
		return "redirect:/customer/list";
	}
}
