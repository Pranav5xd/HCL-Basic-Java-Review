package com.hcl.collection.compare;

import java.util.Comparator;

public class Person {
	int id;
	String name;

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static class NameCompare implements Comparator<Person> {
		public int compare(Person obj1, Person obj2) {
			return obj1.getName().compareTo(obj2.getName());
		}
	}

	public static class IDCompare implements Comparator<Person> {
		public int compare(Person obj1, Person obj2) {
			if (obj1.getID() < obj2.getID())
				return -1;
			if (obj1.getID() > obj2.getID())
				return 1;
			else
				return 0;
		}
	}
}
