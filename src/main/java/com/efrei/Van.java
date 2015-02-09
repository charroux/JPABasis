package com.efrei;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{

	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

}
