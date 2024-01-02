package string;

public class Samplemethods {

	public static void main(String[] args) {
		 String str="    manojkumar  ";
		 String str1="MANOJkumar";
		System.out.println(str.charAt(4));
		System.out.println(str.length());
System.out.println(str.substring(3, 8));
System.out.println(str.contains("MAN"));
System.out.println(str.equals(str1));
System.out.println(str.equalsIgnoreCase(str1));
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.trim());
System.out.println(str.replace(str1, str));

	}

}
