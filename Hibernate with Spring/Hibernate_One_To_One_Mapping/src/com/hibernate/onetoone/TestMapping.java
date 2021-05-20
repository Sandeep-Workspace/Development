package com.hibernate.onetoone;

import java.util.Calendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = null;
		Session session = null;
		sessionFactory = new Configuration().
				configure("hibernate.cfg.xml").
				addAnnotatedClass(AccountEntity.class).
				addAnnotatedClass(PanDetails.class).
				buildSessionFactory();
		
		session = sessionFactory.getCurrentSession();
		
		// create a calendar
		Calendar cal = Calendar.getInstance();
		
		// set the year,month and day
		cal.set(1993, 12, 11);
		
		//create PanDetail object
		PanDetails pan = new PanDetails();
		pan.setName("Sandeep Chouhan");
		//setting calendar object inside PanDetail object
		pan.setDob(cal);
		
		//create Account Object
		AccountEntity account = new AccountEntity();
		account.setCustomerName("Sandeep Chouhan");
		account.setBranch("Palsikar Colony");
		account.setPanDetails(pan);
		
		session.beginTransaction();
		int id =(int) session.save(account);
		session.getTransaction().commit();
		session.close();
		
		System.out.println("Id is: "+id);
	}

}
