package com.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Nail_Brand")
public class NailPaint extends Cosmetics {

	String n_Name;

	public NailPaint(String make_country, double price, String n_Name) {
		super(make_country, price);
		this.n_Name = n_Name;
	}
	
	
	
}
