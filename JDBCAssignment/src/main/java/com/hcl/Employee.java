package com.hcl;

import java.util.Date;

public class Employee {
	private int empID;
	private String empName;
	private Date dateOfBirth;
	private int salary;
	private int age;

	public Employee() {
		this.empID = 0;
		this.empName = null;
		this.dateOfBirth = null;
		this.salary = 0;
		this.age = 0;
	}

	public Employee(String empName, Date dob, int salary, int age) {
		this.empName = empName;
		this.dateOfBirth = dob;
		this.salary = salary;
		this.age = age;
	}

	public String toString() {
		return this.empID + " " + this.empName + " " + this.dateOfBirth + " " + this.salary + "_" + this.age;
	}

	public int getID() {
		return empID;
	}

	public String getName() {
		return empName;
	}

	public Date getDOB() {
		return dateOfBirth;
	}

	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}

	public void setID(int empID) {
		this.empID = empID;
	}

	public void setName(String empName) {
		this.empName = empName;
	}

	public void setDOB(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
