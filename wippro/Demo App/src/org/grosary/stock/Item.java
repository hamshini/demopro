package org.grosary.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="ITEM_DETAILS")
public class Item {
	
	public Item(int id, String name, int quantity, double price) {
		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public Item() {
	
	}
	static{
		Item.totalpro=-1;
		Item.totalpro++;
	}

	public static int totalpro;
	@Id
	@GeneratedValue
	@Column(name="ITEM_ID")
private int id;
	@Column(name="ITEM_NAME")
private String name;
	@Column(name="ITEM_QUANTITY")
private int quantity;
	@Column(name="ITEM_PRICE")
private double price;
public static int getTotalpro() {
	return totalpro;
}
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
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
