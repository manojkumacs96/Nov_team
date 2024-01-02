package forloop;

public class Prime {

	public static void main(String[] args) {
		 int count=0;
		 int num =89;
		 for (int i=1;i<=89;i++) {
			 if (num%i==0) {
				 count ++;
				 
			 }
		 }
		  if (count==2) {
			  System.out.println("number is prime");
			  
		  }
		  else {
			  System.out.println("number is not prime");
		  }
		 }
		 
			 
		 
	}




