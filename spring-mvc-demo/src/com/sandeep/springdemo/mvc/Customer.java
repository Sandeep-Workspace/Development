package com.sandeep.springdemo.mvc;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Customer {

	@NotEmpty(message="Field is required")
	private String firstName;
	
	@NotNull(message="field should not be blank")
	private String lastName;

	public Customer() {
		super();
		System.out.println("Customer No-Arg Constructor");
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
