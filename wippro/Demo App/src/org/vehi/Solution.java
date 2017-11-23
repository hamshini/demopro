package org.vehi;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.vehi.Twowheeler;
import org.vehi.Fourwheeler;
import org.vehi.Vehicle;

public class Solution {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Vehicle vehicle = new Vehicle();
		vehicle.setName("car");

		Twowheeler two = new Twowheeler();
		two.setName("Bike");
		two.setStreeringHandle("Bike streeringHandle");
		Fourwheeler four = new Fourwheeler();
		four.setName("Porsche");
		four.setStreeringHandle("Porsche streeringHandle");
	
		session.save(vehicle);
		session.save(two);
		session.save(four);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}
}
