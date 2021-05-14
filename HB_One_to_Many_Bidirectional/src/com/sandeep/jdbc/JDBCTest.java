package com.sandeep.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcUrl= "jdbc:mysql://localhost:3306/restdb?useSSL=false";
		String user="root";
		String password="Admin";
		
		try {
			System.out.println("Connecting to database");
			Connection myCon= DriverManager.getConnection(jdbcUrl, user, password);
			
			System.out.println("Connection Successful");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
