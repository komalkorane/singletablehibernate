package com.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Lip_Brand")
public class Lipstick extends Cosmetics{

	String l_Name;

	public Lipstick(String make_country, double price, String l_Name) {
		super(make_country, price);
		this.l_Name = l_Name;
	}
	
	
	
}
