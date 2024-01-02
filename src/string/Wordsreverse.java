package string;

public class Wordsreverse {

	public static void main(String[] args) {
		String str= "I love my father";
		String [ ]words =str.split(" ");
		String rev= " ";
		for(int i=words.length-1;i>=0;i--) {
			rev=rev+words[i] + " "; //  father 
		}
System.out.println(rev);
	}

}
