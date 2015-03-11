package com.efrei;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rent {
	
	long key;
	Date beginDate;
	Date endDate;
	
	Person person;
	Vehicule vehicule;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getKey() {
		return key;
	}

	public void setKey(long key) {
		this.key = key;
	}

	@Temporal(TemporalType.DATE)
	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	@Temporal(TemporalType.DATE)
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@ManyToOne
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@ManyToOne
	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	@Override
	public String toString() {
		return "Rent [key=" + key + ", beginDate=" + beginDate + ", endDate="
				+ endDate + "]";
	}
	
	
	
	
}
