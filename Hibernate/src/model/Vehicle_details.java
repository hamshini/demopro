package model;
import javax.persistence.*;
@Entity
@Table
(name="vehicle_details")
public class Vehicle_details {
	@Id
	@GeneratedValue(generator = "vehicle_id",strategy= GenerationType.TABLE)
	//@SequenceGenerator(name = "vehicle_id",sequenceName="vehicle_id_gen",initialValue= 101,allocationSize = 1)
	@TableGenerator(name= "vehicle_id",table = "vehicle_id_generator",allocationSize = 1,initialValue = 100,pkColumnName = "vehicle_id",pkColumnValue = "next_id",valueColumnName = "vehicle_id1")
	@Column(name = "vehicle_id")
	public Integer vehicle_id;
	
	@Column(name = "vehicle_model",nullable = false,length=30)
	public String vehicle_model;
	
	@Column(name = "reg_num" ,nullable = false)
	 public int reg_num;
	
	@Column(name = "brand_name",nullable = false)
	public String brand_name;
	
	@Column(name = "vehicle_color",nullable = false)
	public String vehicle_color;
	 
	public Integer getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(Integer vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public int getReg_num() {
		return reg_num;
	}

	public void setReg_num(int reg_num) {
		this.reg_num = reg_num;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getVehicle_color() {
		return vehicle_color;
	}

	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}

	public date getIndate() {
		return indate;
	}

	public void setIndate(date indate) {
		this.indate = indate;
	}

	@Column(name = "indate",nullable = false)
	public date indate;
	
	
}
