package com.efrei;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		
		Person person = new Person();
		person.setName("Tintin");
		
		Rent rent1 = new Rent();
		
		Calendar calendar = Calendar.getInstance();
		Date beginRent = calendar.getTime();
		rent1.setBeginRent(beginRent);
		
		calendar.add(Calendar.DAY_OF_MONTH, 15);
		Date endRent = calendar.getTime();
		rent1.setEndRent(endRent);
		
		person.addRent(rent1);
		
		entityManager.persist(rent1);
		entityManager.persist(person);
		
		Car car = new Car();
		car.setNumberOfSeats(5);
		car.setPlateNumber("EE 15 ERR");
		
		/*List<Rent> rents = new ArrayList<Rent>();
		rents.add(rent1);
		car.setRents(rents);
		
		rent1.setVehicule(car);*/
		
		car.addRent(rent1);
		
		entityManager.persist(car);
		
		tx.commit();
		
		Car car1 = entityManager.find(Car.class, "EE 15 ERR");
		System.out.println(car1);
		
		Person person1 = (Person)entityManager.createQuery("select p from Person p where p.name like 'Tintin'").getSingleResult();
		System.out.println(person1);
	}
}
