package com.hcl.part1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClass {
	public static void main(String args[]) {
		List<Fruit> fList = new ArrayList<Fruit>();
		fList.add(new Fruit(1, "Apple", 2));
		fList.add(new Fruit(2, "Banana", 1));
		fList.add(new Fruit(3, "Watermelon", 5));
		fList.add(new Fruit(4, "Honey Dew", 4));

		Set<String> fruitName = fList.stream().filter(p -> p.price > 3).map(p -> p.name).collect(Collectors.toSet());
		Map<Integer, String> fruitIDNameMap = fList.stream().filter(p -> p.price > 3)
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println(fruitName);
		System.out.println(fruitIDNameMap);
	}
}
