package org.vehi;

import javax.persistence.Entity;

@Entity
public class Twowheeler extends Vehicle {
private String StreeringHandle;

public String getStreeringHandle() {
	return StreeringHandle;
}

public void setStreeringHandle(String streeringHandle) {
	StreeringHandle = streeringHandle;
}

public Twowheeler() {
	super();
}

}
