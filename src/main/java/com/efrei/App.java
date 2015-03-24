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
		
		try{
			
			tx.begin();
			
			Person person = new Person();
			person.setName("Tintin");
			
			Car car = new Car();
			car.setPlateNumber("11AA22");
			car.setNumberOfSeats(5);
			
			Rent rent = new Rent();
			
			rent.setPerson(person);
			person.getRents().add(rent);
		
			Calendar aujourdhui = Calendar.getInstance();
			Date beginRent = aujourdhui.getTime();
			rent.setBeginRent(beginRent);
			
			aujourdhui.add(Calendar.DAY_OF_MONTH, 15);
			Date endRent = aujourdhui.getTime();
			rent.setEndRent(endRent);
				
			rent.setVehicule(car);
			car.getRents().add(rent);
			
			entityManager.persist(person);
			entityManager.persist(car);
			entityManager.persist(rent);
			
			tx.commit();
			
			Car c = entityManager.find(Car.class, "11AA22");
			System.out.println(c);
			
			List<Person> persons = entityManager.createQuery("select p from Person p where p.name like 'Tintin'").getResultList();
			for(Person p : persons){
				System.out.println(p);
			}
			
		}catch(Exception e){
			tx.rollback();
		}
		
	}
}
