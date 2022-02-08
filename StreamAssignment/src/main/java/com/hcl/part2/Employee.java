package com.hcl.part2;

public class Employee {
	String name;
	int salary;
	int age;

	public Employee(String name, int salary, int age) {
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	
	public String toString(){
	    return this.name + " $" +this.salary+ " " + this.age;
	  }
}
