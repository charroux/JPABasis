package com.efrei;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vehicule {
	
	Set<Rent> rents = new HashSet<Rent>();
	
	String plateNumber;

	@Id
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="vehicule")
	public Set<Rent> getRents() {
		return rents;
	}
	public void setRents(Set<Rent> rents) {
		this.rents = rents;
	}	

}
