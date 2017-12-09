package org.vehi;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.JOINED )
@DiscriminatorColumn(name="VEHICLE_TYPE",discriminatorType=DiscriminatorType.STRING)
@Table(name="VEHICLE_DETAILS")
@DiscriminatorValue("vehi")
public class Vehicle {
	public Vehicle() {
		
	}

	@Id
	@GeneratedValue
	@Column(name="VEHICLE_ID")
private int vehicleId;
	@Column(name="VEHICLE_NAME")
private String name;
public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
