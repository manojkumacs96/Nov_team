package string;

public class Reverse {

	public static void main(String[] args) {
   String str = "MANOJ";
   String rev="";
   
   for(int i=str.length()-1;i>=0;i--) {
	   rev=rev+str.charAt(i);
   }
   System.out.println(rev); 
	
   StringBuffer sb=new StringBuffer("AJAY");
   sb.reverse();
   System.out.println(sb);
   
  
   
	}

}
