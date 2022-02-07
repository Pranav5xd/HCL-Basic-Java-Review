package com.hcl.collection.arraylist;

import java.util.ArrayList;

public class ArrayListAndTheory {

	public static void main(String args[]) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "John", "New York"));
		empList.add(new Employee(2, "Jane", "New Jersey"));
		empList.add(new Employee(3, "Jake", "New Mexico"));

		for (Employee emp : empList) {
			System.out.println(emp.id + " " + emp.name + " " + emp.city);
		}

		/**
		 * 2.In which condition ArrayList should be used.
		 * 
		 * When we need constant time for search operation
		 * 
		 * 3.For which scenarios Map should be used.
		 * 
		 * When the order does not matter but data should be retrieved with a key
		 * 
		 * 4.For which scenarios Set should be used.
		 * 
		 * To have no duplicate values
		 */
	}
}
