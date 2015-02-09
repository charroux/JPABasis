package com.efrei;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {

	int id;
	String name;
	Collection<Rent> rents = new ArrayList<Rent>();	
	
	@OneToMany(mappedBy="person")
	public Collection<Rent> getRents() {
		return rents;
	}
	
	public void setRents(Collection<Rent> rents) {
		this.rents = rents;
	}
	
	public void addRent(Rent rent){
		rents.add(rent);
		rent.person = this;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
}
