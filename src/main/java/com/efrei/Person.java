package com.efrei;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	int id;
	String name;
	
	@Id
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
