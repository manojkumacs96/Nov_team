package operators;

public class Task1 {

	public static void main(String[] args) {
		int year=1990;
		if (year %4==0 || year %400==0 && year % 100 !=0) {
			System.out.println("It is leap year");
		}
		else {
			System.out.println("It is not leap year");
		}
	}

}
