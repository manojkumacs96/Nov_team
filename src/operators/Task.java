package operators;

import java.nio.file.spi.FileSystemProvider;

public class Task {

	public static void main(String[] args) {
		int marks = 100;
		if (marks==35) {
			System.out.println("student is pass");
		}
		else if (marks < 35) {
			System.out.println("student is fail");
		}
		else if (marks >=45) {
			System.out.println("student grade is D");
			
		}
		else if (marks >=60) {
			System.out.println("student grade is C");
		}
		else if  (marks >=70) {
			System.out.println("student grade is B");
		}
		else if (marks >=85) {
			System.out.println("student grade is A");
		}
		else if (marks >=90) {
			System.out.println("student grade is O");
		}
		else {
			
			System.out.println("INVALID");
		}
		
		
	}
	
	
			
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		