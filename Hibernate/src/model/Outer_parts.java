package model;
import javax.persistence.*;
@Entity
@Table
(name="saftey_equipments_details")
public class Outer_parts {
	@Id	
	@Column(name = "head_lamp",nullable = false,length=30)
	public String head_lamp;
	
	@Column(name = "bumper_type" ,nullable = false)
	 public int bumper_type;
	
	@Column(name = "paint_color",nullable = false)
	public String paint_color;
	
	@Column(name = "rim_type",nullable = false)
	public String rim_type;
	
	@Column(name = "tyre_type",nullable = false)
	 public String tyre_type;
	
	@Column(name = "sunroof_type",nullable = false)
	public String sunroof_type;

	public String getHead_lamp() {
		return head_lamp;
	}

	public void setHead_lamp(String head_lamp) {
		this.head_lamp = head_lamp;
	}

	public int getBumper_type() {
		return bumper_type;
	}

	public void setBumper_type(int bumper_type) {
		this.bumper_type = bumper_type;
	}

	public String getPaint_color() {
		return paint_color;
	}

	public void setPaint_color(String paint_color) {
		this.paint_color = paint_color;
	}

	public String getRim_type() {
		return rim_type;
	}

	public void setRim_type(String rim_type) {
		this.rim_type = rim_type;
	}

	public String getTyre_type() {
		return tyre_type;
	}

	public void setTyre_type(String tyre_type) {
		this.tyre_type = tyre_type;
	}

	public String getSunroof_type() {
		return sunroof_type;
	}

	public void setSunroof_type(String sunroof_type) {
		this.sunroof_type = sunroof_type;
	}
	
	
}
