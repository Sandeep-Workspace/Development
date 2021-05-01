package com.sandeep.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from html form
		String name= request.getParameter("studentName");

		//convert the data to all caps
		name = name.toUpperCase();
		
		//create message
		String result = "Yo! " + name;
		
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
}
