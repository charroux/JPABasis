package com.efrei;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;


@Entity
public class Person {

	int id;
	String name;
		
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
	
	public static void main(String [] a){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		Person p = new Person();
		entityManager.persist(p);
	}
	
	
}
