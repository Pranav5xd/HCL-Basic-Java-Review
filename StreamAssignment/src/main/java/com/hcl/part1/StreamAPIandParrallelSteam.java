package com.hcl.part1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPIandParrallelSteam {
	public static void main(String args[]) {
		List<Fruit> fList = new ArrayList<Fruit>();
		fList.add(new Fruit(1, "Apple", 2));
		fList.add(new Fruit(2, "Banana", 1));
		fList.add(new Fruit(3, "Watermelon", 5));
		fList.add(new Fruit(4, "Honey Dew", 4));

		fList.stream().filter(p -> p.price > 3).map(p -> p.name).forEach(System.out::println);
		System.out.println(fList.stream().filter(p -> p.price > 3).count());
		Set<String> fruitName = fList.stream().filter(p -> p.price > 3).map(p -> p.name).collect(Collectors.toSet());
		fList.parallelStream().forEach(System.out::println);
		Map<Integer, String> fruitIDNameMap = fList.stream().filter(p -> p.price > 3)
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(fruitName);
		System.out.println(fruitIDNameMap);
	}
}
