package com.efrei;

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
		
		Person person1 = new Person();
		person1.setName("Tintin");
		
		Car car = new Car();
		car.setNumberOfSeats(5);
		car.setPlateNumber("11 AA 22");	// primary key
		
		Van van = new Van();
		van.setMawWeight(2000);
		van.setPlateNumber("22 BB 22");
		
		Rent rent1 = new Rent();
		Calendar calendar = Calendar.getInstance();
		Date aujourdhui = calendar.getTime();
		rent1.setBeginDate(aujourdhui);
		
		calendar.add(Calendar.DAY_OF_MONTH, 15);
		Date retour = calendar.getTime();
		rent1.setEndDate(retour);
		
		rent1.setPerson(person1);
		person1.getRents().add(rent1);
		
		rent1.setVehicule(car);
		car.getRents().add(rent1);
		
		Rent rent2 = new Rent();
		calendar = Calendar.getInstance();
		aujourdhui = calendar.getTime();
		rent2.setBeginDate(aujourdhui);
		
		calendar.add(Calendar.DAY_OF_MONTH, 15);
		retour = calendar.getTime();
		rent2.setEndDate(retour);
		
		rent2.setPerson(person1);
		person1.getRents().add(rent2);
		
		rent2.setVehicule(van);
		van.getRents().add(rent2);
		
		entityManager.persist(person1);
		entityManager.persist(rent1);
		entityManager.persist(rent2);
		entityManager.persist(car);
		entityManager.persist(van);
		
		tx.commit();
		
		van = entityManager.find(Van.class, "22 BB 22");	// by primary key
		System.out.println("van = " + van);
		
		List<Person> list = entityManager.createQuery("select p from Person p where p.name like 'Tintin'").getResultList();
		for(Person person : list){
			System.out.println("person = " + person);
		}
	}
}
