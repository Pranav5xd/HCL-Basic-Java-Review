package com.hcl.utility;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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

	public void findAll() {

		EntityManager em = JPAManagerFactory.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Query q = em.createQuery("select s from student s");
		@SuppressWarnings("unchecked")
		List<Student> students = q.getResultList();
		for (Student s : students) {
			System.out.println(s);
		}
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
