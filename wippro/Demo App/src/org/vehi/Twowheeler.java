package org.vehi;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("two")
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
