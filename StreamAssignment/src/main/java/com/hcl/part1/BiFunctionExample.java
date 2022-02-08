package com.hcl.part1;

import java.util.function.BiFunction;

public class BiFunctionExample {
	public Integer areaCalc(BiFunction<Integer, Integer, Integer> bi, Integer x, Integer y) {
		return bi.apply(x, y);
	}

	public static void main(String args[]) {
		BiFunctionExample bfe = new BiFunctionExample();
		Integer squareArea = bfe.areaCalc((x, y) -> x * y, 5, 5);
		Integer rectangleArea = bfe.areaCalc((x, y) -> x * y, 5, 10);
		Integer triangleArea = bfe.areaCalc((x, y) -> x * y / 2, 10, 6);
		System.out.println(squareArea);
		System.out.println(rectangleArea);
		System.out.println(triangleArea);
	}
}
