package string;

public class Words {

	public static void main(String[] args) {
		String str= "My father name is sampath kumar";
		int count=0;
		for(int i=0;i<str.length();i++) { // 18
			if(str.charAt(i)==' ') {
			count++;
			}	
		}
		
		count=count+1;
		System.out.println(count);

	}

}
