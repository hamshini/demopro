package org.dummy;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.grosary.stock.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.loader.plan.build.spi.ExpandingEntityIdentifierDescription;
import org.sample.emp.Employee;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		session.beginTransaction();
		while(true){
			System.out.println("Enter your choice");
			int choice = Integer.valueOf(bf.readLine());
			switch(choice){
			case 1:
				Item obj=new Item();
				System.out.println("Enter the item name");
				obj.setName(bf.readLine());
				System.out.println("Enter the item quantity");
				obj.setQuantity(Integer.valueOf(bf.readLine()));
				System.out.println("Enter the item price");
				obj.setPrice(Double.valueOf(bf.readLine()));
				System.out.println("id: " + obj.getId());
				System.out.println("name: " + obj.getName());
				System.out.println("quantity: " + obj.getQuantity());
				System.out.println("price: " + obj.getPrice());
				session.save(obj);
				session.getTransaction().commit();
				break;
			case 2:
				Item obj1=session.get(Item.class,1);
				System.out.println("id: " + obj1.getId());
				System.out.println("name: " + obj1.getName());
				System.out.println("quantity: " + obj1.getQuantity());
				System.out.println("price: " + obj1.getPrice());
				session.save(obj1);
				session.getTransaction().commit();
				break;
			case 3:
				Item obj2=session.get(Item.class,1);
				obj2.setName("Paste");									
				obj2.setPrice(200);
				session.update(obj2);
				session.save(obj2);
				session.getTransaction().commit();
				break;
			case 4:
				Item obj3=new Item();
				obj3.setId(2);
				session.delete(obj3);
				session.save(obj3);
				session.getTransaction().commit();
				break;
			case 5:
				Item obj4=session.get(Item.class,0);
				System.out.println("id: " + obj4.getId());
				System.out.println("name: " + obj4.getName());
				System.out.println("quantity: " + obj4.getQuantity());
				System.out.println("price: " + obj4.getPrice());
				session.save(obj4);
				session.getTransaction().commit();
				break;
				
			case 6:
				System.out.println("Total Number Of Products= "+Item.getTotalpro());
				break;
			default:
				break;
			}
			
		}
		/*int i = 0;
		
		
		while (i < 3) {
			i++;
			System.out.println("Enter id: ");
			int id = Integer.valueOf(bf.readLine());
			System.out.print("Enter name: ");
			String name = bf.readLine();
			System.out.print("Enter Email: ");
			String email = bf.readLine();
			System.out.print("Enter phone: ");
			long phone = Long.valueOf(bf.readLine());
			
			Employee emp = new Employee(id, name, email, phone);
		
			System.out.println("id: " + emp.getId());
			System.out.println("email: " + emp.getEmail());
			System.out.print("phone: " + emp.getPhone());
		
			
			System.out.println("Enter Bookid: ");
			int bookId = Integer.valueOf(bf.readLine());
			System.out.print("Enter bookName: ");
			String bookName = bf.readLine();
			System.out.print("Enter author: ");
			 String author=bf.readLine();
			 System.out.print("Enter price: ");
			 double price= bf.read();
			 System.out.print("Enter published: ");
			 Date published=new Date(bf.readLine());
			 System.out.print("Enter isbnNo: ");
			 String isbnNo=bf.readLine();
			 
				Book bk=new Book(bookId,bookName,author,price,published,isbnNo);
			/*	System.out.println("Enter BasicSalary");
			double basicSalary=bf.read();
		System.out.println("Enter travelAllowance");
			float travelAllowance=bf.read();
			System.out.println("Enter dearnessAllowance");
			float dearnessAllowance=bf.read();
			System.out.println("Enter houseRentAllowance");
			float houseRentAllowance=bf.read();
			System.out.println("Enter providentFund");
			float providentFund=bf.read();
			// System.out.print("Enter gender: ");
			// boolean gender = Boolean.valueOf(bf.readLine());
			
			
			
			// System.out.print("gender: " + emp.isGender());
			System.out.println("BasicSalary:"+emp.getBasicSalary());
			System.out.println("travelAllowance:"+emp.getTravelAllowance());
			System.out.println("dearnessAllowance:"+emp.getDearnessAllowance());
			System.out.println("houseRentAllowance: "+emp.getHouseRentAllowance());
			System.out.println("providentFund : "+emp.getProvidentFund());
			session.save(emp);
			
			*/
			
		
		
		//session.save(emp);
		//session.save(bk);
		//}
		//session.getTransaction().commit();
	//	sf.close();
		//session.close();
		}
	}
