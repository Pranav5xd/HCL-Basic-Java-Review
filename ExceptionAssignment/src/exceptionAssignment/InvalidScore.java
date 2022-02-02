package exceptionAssignment;

public class InvalidScore extends Exception{
	public InvalidScore() {
		System.out.println("User defined Exception thrown");
	}
	public String toString() {
		return "Invalid score given, must be between 0 and 100 inclusive." ;
	}
}
