package com.sandeep.spring.annotation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes;
	
	private Random rand = new Random();
	
	private String filelocation="fortune.txt";

	public FileFortuneService() {
		// TODO Auto-generated constructor stub
	System.out.println("File Fortune Service Default Constructor");
	}
	
	@PostConstruct
	private void loadFortune() {

		fortunes = new ArrayList<String>();
		try {
			File myObj = new File(filelocation);
			if (myObj.exists() && myObj.canRead()) {
				Scanner scan = new Scanner(myObj);
				String temp = "";
				while (scan.hasNext()) {
					temp = scan.nextLine();
					fortunes.add(temp);
				}
				temp = null;
				scan.close();
			} else {
				throw new FileNotFoundException();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found or Unable to read");
		}
	}
	
	@Override
	public String getFortune() {
		String temp = fortunes.get(rand.nextInt(fortunes.size()));
		return temp;
	}

	
}