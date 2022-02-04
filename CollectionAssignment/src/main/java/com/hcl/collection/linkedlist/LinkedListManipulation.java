package com.hcl.collection.linkedlist;

import java.util.LinkedList;

public class LinkedListManipulation {
	public static void main(String args[]) {
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
		cars.addFirst("Toyota");
		System.out.println(cars);
		cars.addLast("Honda");
		System.out.println(cars);
		cars.removeFirst();
		System.out.println(cars);
		cars.removeLast();
		System.out.println(cars);
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		;
	}
}
