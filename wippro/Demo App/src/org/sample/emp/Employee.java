package org.sample.emp;




//@Table(name="EMPLOYEE_DETAILS")
public class Employee {
	

	public Employee() {
		super();
		
	}

	public Employee(int id, String name, String email, long phone/*,double basicSalary,float travelAllowance,
	float dearnessAllowance,float houseRentAllowance,float providentFund*/) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
	//	this.gender = gender;
	}

//@Column(name = "EMP_ID")
	private int id;
//@Column(name = "EMP_NAME",length=150,nullable=false)
	private String name;
	//@Column(name = "EMAIL_ID",nullable=false,unique=true)
	private String email;
	//@Column(name="phone",nullable=false,unique=true)
	private long phone;
	//@Column(name = "BASIC_SALARY")
	private double basicSalary;
	//@Column(name = "TA")
	private float travelAllowance;
	//@Column(name = "DA")
	private float dearnessAllowance;
	//@Column(name = "HRA")
	private float houseRentAllowance;
	//@Column(name = "PF")
	private float providentFund;

	private double netSalary;
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

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getTravelAllowance() {
		return travelAllowance;
	}

	public void setTravelAllowance(float travelAllowance) {
		this.travelAllowance = travelAllowance;
	}

	public float getDearnessAllowance() {
		return dearnessAllowance;
	}

	public void setDearnessAllowance(float dearnessAllowance) {
		this.dearnessAllowance = dearnessAllowance;
	}

	public float getHouseRentAllowance() {
		return houseRentAllowance;
	}

	public void setHouseRentAllowance(float houseRentAllowance) {
		this.houseRentAllowance = houseRentAllowance;
	}

	public float getProvidentFund() {
		return providentFund;
	}

	public void setProvidentFund(float providentFund) {
		this.providentFund = providentFund;
	}


}
