package com.sandeep.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favouriteLanguage;
	private String[] OperatingSystem;
	
	public Student() {
		super();
		countryOptions = new LinkedHashMap<String,String>();
		countryOptions.put("IN","INDIA");
		countryOptions.put("BR", "BRAZIL");
		countryOptions.put("DE","Germany");
		countryOptions.put("FR","FRANCE");
		countryOptions.put("US","United States of America");
	}

	public Student(String firstName, String lastName, String country,String favouriteLanguage, String [] OperatingSystem) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.favouriteLanguage = favouriteLanguage;
		this.OperatingSystem = OperatingSystem;
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
		
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public LinkedHashMap<String,String> getCountryOptions(){
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public String[] getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		OperatingSystem = operatingSystem;
	}
	
	
}
