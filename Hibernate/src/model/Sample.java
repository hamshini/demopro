package model;
import javax.persistence.*;
@Entity
@Table
(name="cus_details")
public class Sample {
	@Id
	@GeneratedValue(generator = "cus_id",strategy= GenerationType.TABLE)
	//@SequenceGenerator(name = "cus_id",sequenceName="cus_id_gen",initialValue= 101,allocationSize = 1)
	@TableGenerator(name= "cus_id",table = "cus_id_generator",allocationSize = 1,initialValue = 100,pkColumnName = "cus_id",pkColumnValue = "next_id",valueColumnName = "cus_id1")
	@Column(name = "cus_id")
	public Integer cus_id;
	
	@Column(name = "cus_name",nullable = false,length=30)
	public String cus_name;
	
	@Column(name = "gender" ,nullable = false)
	 public String gender;
	
	@Column(name = "dob",nullable = false)
	public String dob;
	
	@Column(name = "cus_address",nullable = false)
	public String cus_address;
	 
	@Column(name = "phone_num",nullable = false)
	public String phone_num;
	
	public Integer getCus_id() {
		return cus_id;
	}

	public void setCus_id(Integer cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCus_address() {
		return cus_address;
	}

	public void setCus_address(String cus_address) {
		this.cus_address = cus_address;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public int getCus_Id() {
		return cus_id;
	}

	public void setCus_Id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_Name() {
		return cus_name;
	}

	public void setCus_Name(String cus_name) {
		this.cus_name = cus_name;
	}
}
