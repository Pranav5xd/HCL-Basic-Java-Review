package com.hcl.collection.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.hcl.collection.compare.Person.AgeCompare;
import com.hcl.collection.compare.Person.Doctor;
import com.hcl.collection.compare.Person.IDCompare;
import com.hcl.collection.compare.Person.NameCompare;
import com.hcl.collection.compare.Person.Patient;
import com.hcl.collection.compare.Person.SpecialtyCompare;

public class Hospital {

	public static void printDoc(ArrayList<Doctor> docList) {
		for (Doctor d : docList)
			System.out.println("[" + d.getID() + " " + d.getName() + " " + d.specialty + "]");
	}

	public static void printPat(ArrayList<Patient> patList) {
		for (Patient p : patList)
			System.out.println("[" + p.getID() + " " + p.getName() + " " + p.age + "]");
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
