package com.efrei;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule{

	private int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
}
