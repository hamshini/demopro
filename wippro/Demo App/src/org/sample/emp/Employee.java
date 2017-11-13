package org.sample.emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	

	public Employee() {
		super();
		
	}

	public Employee(int id, String name, String email, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	//	this.gender = gender;
	}
@Id
	private int id;
	private String name;
	private String email;
	private long phone;
	//private boolean gender;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}


}
