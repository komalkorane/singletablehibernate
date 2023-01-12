package com.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@DiscriminatorColumn(name="Cosmetic_Type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Cosmestic")
public class Cosmetics {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String make_country;
	double price;
	public Cosmetics(String make_country, double price) {
		super();
		this.make_country = make_country;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cosmetics [id=" + id + ", make_country=" + make_country + ", price=" + price + "]";
	}
	
}
