package com.hcl.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hospital {

	public static class Person {
		int id;
		String name;

		public int getID() {
			return id;
		}

		public String getName() {
			return name;
		}
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
	
	public static void printDoc(ArrayList<Doctor> docList) {
		 for (Doctor d: docList)
	            System.out.println(d.getID() + " " +
	                               d.getName() + " " +
	                               d.specialty);
	}
	
	public static void printPat(ArrayList<Patient> patList) {
		 for (Patient p: patList)
	            System.out.println(p.getID() + " " +
	                               p.getName() + " " +
	                               p.age);
	}
	
	public static void main(String args[]) {
		ArrayList<Doctor> docList = new ArrayList<Doctor>();
		ArrayList<Patient> patList = new ArrayList<Patient>();
		
		docList.add(new Doctor(3, "Who", "Space Time"));
		docList.add(new Doctor(1, "Nick", "Cartoons"));
		docList.add(new Doctor(2, "Bailey", "Anatomy"));
		System.out.println("Doctors");
		System.out.println();
		System.out.println("No Sort");
		printDoc(docList);
		System.out.println("Sorted by ID");
		Collections.sort(docList, new IDCompare());
		printDoc(docList);
		System.out.println("Sorted by Name");
		Collections.sort(docList, new NameCompare());
		printDoc(docList);
		System.out.println("Sorted by Specialty");
		Collections.sort(docList, new SpecialtyCompare());
		printDoc(docList);
		
		System.out.println();
		patList.add(new Patient(3, "John", 20));
		patList.add(new Patient(1, "Jane", 21));
		patList.add(new Patient(2, "Adam", 22));
		System.out.println("Patient");
		System.out.println();
		System.out.println("No Sort");
		printPat(patList);
		System.out.println("Sorted by ID");
		Collections.sort(patList, new IDCompare());
		System.out.println("Sorted by Name");
		Collections.sort(patList, new NameCompare());
		printPat(patList);
		System.out.println("Sorted by Age");
		Collections.sort(patList, new AgeCompare());
		printPat(patList);
		
	}
}
