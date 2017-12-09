package org.vehi;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Four")
public class Fourwheeler extends Vehicle {
	private String StreeringHandle;

	public String getStreeringHandle() {
		return StreeringHandle;
	}

	public void setStreeringHandle(String streeringHandle) {
		StreeringHandle = streeringHandle;
	}

	public Fourwheeler() {
		super();
	}
	
}
