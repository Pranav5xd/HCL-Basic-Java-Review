package com.hcl.homework1.part2;

@SuppressWarnings("serial")
public class StringSizeConditionFailure extends Exception{
	public StringSizeConditionFailure() {
		System.out.println("User Defined Exception Thrown");
	}
	public String toString() {
		return "The string inputed does not meet the 10-15 character requirement." ;
	}

}
