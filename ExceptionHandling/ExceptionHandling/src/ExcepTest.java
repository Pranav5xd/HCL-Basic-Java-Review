import java.util.Scanner; 
public class ExcepTest {
	
	public class Student{
		int studentID;
		String studentName;
		int marks;
		
		public Student(int id, String name, int score) {
			studentID = id;
			studentName = name;
			marks = score;
		}
	}
	
	static void marks() throws IllegalAccessException
    {
        System.out.println("Invalid marks");
        throw new IllegalAccessException("demo");
    }
	
	@SuppressWarnings("finally")
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in); 
		while(true) {
		    System.out.println("Enter StudentID, Marks and StudentName");
		    int id = scan.nextInt();
		    int score = scan.nextInt();
		    String name = scan.nextLine();
		    
		    
		    try {
		    	if (score < 0 || score > 100 ) {
		    		marks();
		    	}
		    	else {
		    		//Student test = new Student(id, name, score);
		    		System.out.println("New Student made with id, name and marks:" + id  + name + " " + score);
		    		
		    	}
		    }catch( IllegalAccessException e) {
		    	System.out.println("Exception thrown  :" + e);
		    }
		    finally {
		    	scan.close();
		    	break;
		    }
		    
		    
		}
      }
  }