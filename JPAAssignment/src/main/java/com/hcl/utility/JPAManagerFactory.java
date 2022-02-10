package com.hcl.utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAManagerFactory {

	private static final String PERSISTENCE = "PERSISTENCE";
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE);
		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}
}
