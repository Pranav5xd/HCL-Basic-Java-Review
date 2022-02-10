package com.hcl.utility;

import javax.persistence.EntityManager;

import com.hcl.entity.Student;

public class JPAOperations {

	public void find(int id) {

		EntityManager em = JPAManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Student stud = em.find(Student.class, id);
		System.out.println(stud);

		em.getTransaction().commit();
		em.close();
	}

	public void insert(String firstName, String lastName, String email) {

		EntityManager em = JPAManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Student stud = new Student(firstName, lastName, email);

		em.persist(stud);

		em.getTransaction().commit();
		em.close();
	}

	public void remove(int id) {

		EntityManager em = JPAManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Student stud = em.find(Student.class, id);
		System.out.println(stud);

		em.remove(stud);

		em.getTransaction().commit();
		em.close();
	}

	public void update(int id, String firstName, String lastName, String email) {

		EntityManager em = JPAManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Student stud = em.find(Student.class, id);
		System.out.println(stud);

		stud.setFirst(firstName);
		stud.setLast(lastName);
		stud.setEmail(email);

		System.out.println(stud);
		em.getTransaction().commit();
		em.close();
	}
}
