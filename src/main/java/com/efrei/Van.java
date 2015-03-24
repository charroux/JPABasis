package com.efrei;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule{
	
	int mawWeight;

	public int getMawWeight() {
		return mawWeight;
	}

	public void setMawWeight(int mawWeight) {
		this.mawWeight = mawWeight;
	}
		
}
