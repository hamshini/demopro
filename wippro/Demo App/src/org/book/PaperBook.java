package org.book;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="paperbook_Details")
@DiscriminatorValue("paperbook")
public class PaperBook extends Book {
@Column(name="shipping_weight")
	float shipping_weight;
@Column(name="instock")
	int instock;
	public PaperBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public float getShipping_weight() {
		return shipping_weight;
	}
	public void setShipping_weight(float shipping_weight) {
		this.shipping_weight = shipping_weight;
	}
	public int getInstock() {
		return instock;
	}
	public void setInstock(int instock) {
		this.instock = instock;
	}
	
	
}
