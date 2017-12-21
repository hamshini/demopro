package org.sol;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;



import model.Sample;
public class Solution {
	public static void main(String[] args) {
		Sample s = new Sample();
		Scanner sc = new Scanner(System.in);
		String cusname =sc.next();
		String gender = sc.next();
		String dob = sc.next();
		
		s.setCus_Name("");
		s.setGender("male");
		s.setDob("15-12-2017");
		s.setCus_address("n0.34,");
		s.setPhone_num("4264826298");
		 SessionFactory sf= new Configuration().configure().buildSessionFactory();
		 Session ses =sf.openSession();
		 ses.beginTransaction();
		 ses.save(s);
		 ses.getTransaction().commit();
		 ses.close();
		
	}

}
