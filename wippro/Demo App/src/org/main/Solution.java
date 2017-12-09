package org.main;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();		
		User us=new User();
		Address homeAddress=new Address();
		Address compAddress=new Address();
		us.setId(2);
		us.setName("steve");
		us.setEmail("sdbfms");
		us.setPhone(787678);
		us.setCompanyAddress(compAddress);
		us.setHomeAddress(homeAddress);
		
		//Object user=Class.forName("org.main.Demo").newInstance();
		session.save(us);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
