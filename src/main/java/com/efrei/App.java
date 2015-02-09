package com.efrei;


import java.util.Calendar;
import java.util.Date;

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
		
		tx.commit();
    }
}
