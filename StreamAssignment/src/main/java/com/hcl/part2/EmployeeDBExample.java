package com.hcl.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeDBExample {
	public static void main(String args[]) {
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee("John Doe", 1500, 25));
		eList.add(new Employee("Jane Doe", 750, 35));
		eList.add(new Employee("Bob Ross", 2000, 10));
		eList.add(new Employee("David Johnson", 100, 18));
		eList.add(new Employee("Ben Franklin", 4000, 150));

		EmployeeDBExample edbe = new EmployeeDBExample();
		edbe.noStream(eList);
		System.out.println();
		edbe.withStream(eList);
	}

	public void noStream(List<Employee> eList) {
		System.out.println("This is with no stream API");
		List<Employee> output = new ArrayList<Employee>();

		System.out.println("Salary over $1000");
		for (Employee e : eList) {
			if (e.salary > 1000) {
				output.add(e);
			}
		}
		System.out.println(output);
		output.clear();

		System.out.println("Name starts with B or D");
		for (Employee e : eList) {
			if (e.name.startsWith("B") || e.name.startsWith("D")) {
				output.add(e);
			}
		}
		System.out.println(output);
		output.clear();

		System.out.println("Age over 30");
		for (Employee e : eList) {
			if (e.age > 30) {
				output.add(e);
			}
		}
		System.out.println(output);
		output.clear();
	}

	public void withStream(List<Employee> eList) {
		System.out.println("This is with stream API");
		Set<Employee> output;
		
		System.out.println("Salary over $1000");
		output = eList.stream().filter(e->e.salary > 1000).collect(Collectors.toSet());
		System.out.println(output);
		
		System.out.println("Name starts with B or D");
		output = eList.stream().filter(e->e.name.startsWith("B") || e.name.startsWith("D")).collect(Collectors.toSet());
		System.out.println(output);
		
		System.out.println("Age over 30");
		output = eList.stream().filter(e->e.age > 30).collect(Collectors.toSet());
		System.out.println(output);
	}
}
