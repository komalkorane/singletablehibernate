package com.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("K_Brand")
public class Kajal extends Cosmetics {

	String k_Name;

	public Kajal(String make_country, double price, String k_Name) {
		super(make_country, price);
		this.k_Name = k_Name;
	}
	
	
	
}
