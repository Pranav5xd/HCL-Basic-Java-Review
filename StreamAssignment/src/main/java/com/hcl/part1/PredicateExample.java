package com.hcl.part1;

import java.util.ArrayList;
import java.util.List;

public class PredicateExample {
	public static void main(String args[]) {
		List<Fruit> fList = new ArrayList<Fruit>();
		fList.add(new Fruit(1, "Apple", 2));
		fList.add(new Fruit(2, "Banana", 1));
		fList.add(new Fruit(3, "Watermelon", 5));
		fList.add(new Fruit(4, "Honey Dew", 4));

		fList.stream().filter(p -> p.price > 3).map(p -> p.name).forEach(System.out::println);
	}
}
