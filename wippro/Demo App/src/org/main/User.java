package org.main;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="User_table")
class User {
	@Embedded
	@AttributeOverride(name="city",column=@Column(name="ciittyy"))
	private Address CompanyAddress;
	private Address homeAddress;
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "EMP_NAME",length=150,nullable=false)
		private String name;
		@Column(name = "EMAIL_ID",nullable=false,unique=true)
		private String email;
		@Column(name="phone",nullable=false,unique=true)
		private long phone;
		
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
		public Address getCompanyAddress() {
			return CompanyAddress;
		}
		public void setCompanyAddress(Address companyAddress) {
			CompanyAddress = companyAddress;
		}
		public Address getHomeAddress() {
			return homeAddress;
		}
		public void setHomeAddress(Address homeAddress) {
			this.homeAddress = homeAddress;
		}
		
		
}
