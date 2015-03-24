package com.efrei;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Vehicule {
	
	String plateNumber;
	List<Rent> rents = new ArrayList<Rent>();
	
	@Id
	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	@OneToMany(mappedBy="vehicule")
	public List<Rent> getRents() {
		return rents;
	}

	public void setRents(List<Rent> rents) {
		this.rents = rents;
	}
	
	
	
	

}
