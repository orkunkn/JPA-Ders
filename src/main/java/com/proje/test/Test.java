package com.proje.test;

import java.util.Date;

import com.proje.model.Address;
import com.proje.model.Customer;
import com.proje.model.Department;
import com.proje.model.Product;
import com.proje.model.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
	
		EntityTransaction transaction = entityManager.getTransaction();
		
		Department department = new Department("Yazili", 3500, 5600);
		Department department2 = new Department("Tester", 2500, 7300);
		transaction.begin();
		
		entityManager.persist(department);
		entityManager.persist(department2);
		
		transaction.commit();
	}
}
