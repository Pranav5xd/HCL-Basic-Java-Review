package com.hcl.collection.compare;

import java.util.Comparator;

public class Doctor extends Person {
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
	
	public static class SpecialtyCompare implements Comparator<Doctor> {
		public int compare(Doctor d1, Doctor d2) {
			return d1.specialty.compareTo(d2.specialty);
		}
	}
}
