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

	public static class Patient extends Person {
		int patientID;
		String patientName;
		int age;

		public Patient(int patientID, String patientName, int age) {
			this.patientID = patientID;
			this.patientName = patientName;
			this.age = age;
		}

		public String getName() {
			return patientName;
		}

		public int getID() {
			return patientID;
		}
	}

	public static class Doctor extends Person {
		int doctorID;
		String doctorName;
		String specialty;

		public Doctor(int doctorID, String doctorName, String specialty) {
			this.doctorID = doctorID;
			this.doctorName = doctorName;
			this.specialty = specialty;
		}

		public String getName() {
			return doctorName;
		}

		public int getID() {
			return doctorID;
		}
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

	public static class SpecialtyCompare implements Comparator<Doctor> {
		public int compare(Doctor d1, Doctor d2) {
			return d1.specialty.compareTo(d2.specialty);
		}
	}

	public static class AgeCompare implements Comparator<Patient> {
		public int compare(Patient p1, Patient p2) {
			if (p1.age < p2.age)
				return -1;
			if (p1.age > p2.age)
				return 1;
			else
				return 0;
		}
	}
}
