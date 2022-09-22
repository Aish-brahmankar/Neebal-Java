
public class Loops {
	public static void main(String[] args) {

		// int x = 3;//

		/*
		 * if (x == 1) { System.out.println("The value of x is 1 : "); } else if (x ==
		 * 2) { System.out.println("The value of x is 2 : "); } else if (x == 3) {
		 * System.out.println("The value of x is 3 : "); } else {
		 * System.out.println("The value of other than 1,2,3"); }
		 */

		/*
		 * switch case switch (x) { case 1: System.out.println("The value of x is 1 :");
		 * break; case 2: System.out.println("The value of x is 2 :"); break; case 3:
		 * System.out.println("The value of x is 3 :"); break; default:
		 * System.out.println("The value of x is other than this 1,2,3:"); break; }
		 */

		/*char x = 'B';

		switch (x) {
		case 'a':
		case 'A':
			System.out.println("The value of x is a :");

			break;
		case 'b':
		case 'B':
			System.out.println("The value of x is b :");

			break;
		case 'c':
		case 'C':
			System.out.println("The value of x is c :");

			break;
		default:
			System.out.println("The value of x is other than this a,b,c:");
			break;

		}*/
		
	/*	String name = "Friends";
		
		switch(name) {
		case "Friends":
			System.out.println();
			break;
		case "Aniket":
			System.out.println();
			break;
		case "Aradhya":
			System.out.println();
			break;	
		default	
		
		}*/
		
		
		
		
		/*For loop
		  for (int i=2, j=3; i<100 || j<100; i++, j++ ) {
			  j++;
			  System.out.println("i="+i+" and j="+j);
		  }*/
		  
		  
		
		/*While loop
		int i=2,j=3;
		
		while(i<10 && j<10) {
			System.out.println("i="+i+" and j="+j);
			i++;
			j++;
		}*/
		  
	
		
		/* Do while
		int i=1 , j=1;
		
		do {
			i++;
			j++;
			System.out.println("i="+i+" and j="+j);
		} while(i<10 || j<10);
		*/
		
		
		
		//Break //
		
	/*	for(int i=1 ; i<=10; i++)
		{
			System.out.println(i); //before if sysout use//
			if(i==6)
				break;
		}*/
		
		//Continue//
		/*for(int i=1 ; i<=10; i++)
		{
			
			if(i==6)
				continue;
			System.out.println(i); //after if sysout use//
		}*/
		
		
		
		//nested loop//
		
		/*for( int i=1; i<=10; i++) {
			for( int j=1; j<=10; j++) {
				System.out.println("Value of i :"+i+" and value of j:"+j");
			}
			System.out.println("**************");
		}*/
		
		
	/*	for(int i=1; i<=5; i++ ) {
			for(int j=1; j<=5; j++) {
		   System.out.print('@');
	
		}
		
		System.out.println();
		

}*/
		
		int x =15;
		
		if(x%2 ==0) {
			System.out.println("Value is even");
			
		}else {
			System.out.println("value is odd");
		}
		
		
		
		
}
}