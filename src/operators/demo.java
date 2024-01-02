package operators;

public class demo {

	public static void main(String[] args) {
		int a=4;
		int b =8;
		int sum=a+b;
		System.out.println(sum);
		int c=56;
		int d=5;
		int division=c/d;
		System.out.println(division);
		float e=107.56f;
		float k=1034.7f;
		float multiply=e*k;
		
		System.out.println(multiply);
	
		String name="manoj";
		int age=26;
		
		System.out.println(name+age);
	
		 
		
		int g=78;
		int h=99;
		boolean result1=(g>h) ||(g>h);
		System.out.println(result1);
			
		boolean ajay =(g!=h);
		System.out.println(ajay);
				int w=45;
				int r=89;
				int result = (w<r) ? 45 : 89 ;
				System.out.println(result);
				
		  int q=100;
		  int z=100;
		  int n=56;
		  int result2 = (q<n) ? ((z>n) ? z: q) : ((n<q) ? q: n) ;
				System.out.println(result2);
   
				int y =100;
				int m=++y;
				System.out.println(m);
				int t=56;
				int u=t++;
			System.out.println(u);	
				
				int o=86;
				int l=--o;
						System.out.println(l);
						int s=86;
						int p=s--; 
						int v=s;
						System.out.println(v);
					System.out.println(q<=z);
						
					int i=60;
					int j=80;
					if ((i>j)  || (i>j)) {
					System.out.println ("LOGICAL AND");
					}	 
	}

}