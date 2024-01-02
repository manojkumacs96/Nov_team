package forloop;

public class Numberdivisible {

	public static void main(String[] args) {
 for (int i= 1 ;i <=50 ;i ++) {
	 
	 if (i%3==0 && i%5!=0) {
		 
		 System.out.println("orange");
	 }
	 else if (i%5==0 && i %3!=0) {
		 System.out.println("mango");
	 }
	 else if (i%3==0 && i%5==0){
		 System.out.println("orangemango");
		 
	 }
	 else if  (i%3!=0 && i%5!=0) {
		 System.out.println(i);
 }
			
 }	
			}
		}
	
	


