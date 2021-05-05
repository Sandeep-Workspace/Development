package com.sandeep.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.sandeep.springdemo.mvc.validation.CourseCode;


public class Customer {

	@NotEmpty(message="Field is required")
	private String firstName;
	
	@NotEmpty(message="Field is required")
	private String lastName;

	@NotNull(message="is required")
	@Min(value=1,message="must be greater than 0")
	@Max(value=10,message="must be less than or equal to 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 characters/digits")
	private String postalCode;
	
	@CourseCode(value="TOPS", message="must start with TOPS")
	private String courseCode;
	
	
	public Customer() {
		super();
		System.out.println("Customer No-Arg Constructor");
	}

	public Customer(String firstName, String lastName,Integer freePasses, String postalCode, String courseCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.freePasses = freePasses;
		this.postalCode = postalCode;
		this.courseCode = courseCode;
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
