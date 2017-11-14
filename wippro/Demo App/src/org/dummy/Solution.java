package org.dummy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sample.emp.Employee;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter id: ");
		int id = Integer.valueOf(bf.readLine());
		System.out.print("Enter name: ");
		String name = bf.readLine();
		System.out.print("Enter Email: ");
		String email = bf.readLine();
		System.out.print("Enter phone: ");
		long phone = Long.valueOf(bf.readLine());
		//System.out.print("Enter gender: ");
		//boolean gender = Boolean.valueOf(bf.readLine());
		Employee emp = new Employee(id, name, email, phone);
		System.out.println("id: " + emp.getId());
		System.out.println("email: " + emp.getEmail());
		System.out.print("phone: " + emp.getPhone());
	//	System.out.print("gender: " + emp.isGender());

		session.close();
	}
}