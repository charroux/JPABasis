package com.efrei;

import javax.persistence.Entity;

@Entity
public class Car extends Vehicule{

	int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
