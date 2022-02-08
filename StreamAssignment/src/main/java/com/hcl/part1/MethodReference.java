package com.hcl.part1;

interface Printer {
	void print();
}

public class MethodReference {

	public static void printSomething() {
		System.out.println("Testing Printing on a new Line");
	}

	public static void main(String[] args) {
		Printer p = MethodReference::printSomething;
		p.print();
	}
}
