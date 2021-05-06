package com.sandeep.restdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlienRepository {

	Connection conn;

	public AlienRepository() {

		String url="jdbc:mysql://localhost:3306/restdb";
		String username = "root";
		String password = "Admin";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Database Connectivity Issue");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Class Not found Issue");
			e.printStackTrace();
		}
	}

	public List<Alien> getAliens(){

		//create list to store all values retrieving from db
		List<Alien> aliens = new ArrayList<Alien>();
		String query = "select * from alien";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while(rs.next()) {
				Alien obj = new Alien();
				obj.setId(rs.getInt(1));
				obj.setName(rs.getString(2));
				obj.setPoints(rs.getInt(3));
				aliens.add(obj);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return aliens;
	}

	public Alien getAlien(int id) {

		Alien alienObject = new Alien();
		String query = "select * from alien where id="+id;
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			if(rs.next()) {
				alienObject.setId(rs.getInt(1));
				alienObject.setName(rs.getString(2));
				alienObject.setPoints(rs.getInt(3));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return alienObject;	
	}

	public void createAlien(Alien a) {
		// TODO Auto-generated method stub
		
		String query = "Insert into alien values(?,?,?)";
		try {
			PreparedStatement st = conn.prepareStatement(query);
			
			st.setInt(1, a.getId());
			st.setString(2, a.getName());
			st.setInt(3, a.getPoints());
			
			st.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateAlien(Alien a) {
		// TODO Auto-generated method stub
		
		String query = "Update alien set name=?,points=? where id=?";
		try {
			PreparedStatement st = conn.prepareStatement(query);
			
			st.setString(1, a.getName());
			st.setInt(2, a.getPoints());
			st.setInt(3, a.getId());

			st.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteAlien(int id) {
		// TODO Auto-generated method stub
		String query = "delete from alien where id=?";
		try {
			PreparedStatement st = conn.prepareStatement(query);
			
			st.setInt(1, id);

			st.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
