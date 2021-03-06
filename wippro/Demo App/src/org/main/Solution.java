package org.main;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.memorynotfound.hibernate.Address;
import org.memorynotfound.hibernate.Person;

public class Solution {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();		
		 Address address = new Address("street", "city", "1234", "state");
	        User us= new User();
		us.setId(2);
		us.setName("steve");
		//us.setEmail("sdbfms");
	//	us.setPhone(787678);
	//	us.setCompanyAddress(compAddress);
	//	us.setHomeAddress(homeAddress);
		
		//Object user=Class.forName("org.main.Demo").newInstance();
		session.save(us);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
