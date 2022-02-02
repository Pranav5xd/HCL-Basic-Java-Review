package com.hcl.homework1;

@SuppressWarnings("serial")
public class InsufficientBalance extends Exception{
	public InsufficientBalance() {
		System.out.println("User Defined Exception Thrown");
	}
	public String toString() {
		return "There is an insufficient balence to complete the desired transaction." ;
	}
}
