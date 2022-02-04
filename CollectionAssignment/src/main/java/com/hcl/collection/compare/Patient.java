package com.hcl.collection.compare;

import java.util.Comparator;

public class Patient extends Person {
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

