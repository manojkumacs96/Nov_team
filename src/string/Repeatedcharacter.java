package string;

public class Repeatedcharacter {

	public static void main(String[] args) {
		String st="indian army is strongest army in the world";
		int totalcount=st.length(); 
		int totalcount_withouta=st.replace("a", "").length();
		int count=totalcount-totalcount_withouta;
		System.out.println(count);

	}

}
