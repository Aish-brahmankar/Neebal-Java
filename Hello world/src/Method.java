
public class Method {
	public static void main(String[] args) {

		
        /*loop1();
		
System.out.println("************************************");

		loop2();
System.out.println("************************************");
		loop1();
		System.out.println("************************************");
		loop3();
	}
	public static void loop1() {
		int i=1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

	}
	public static void loop2() {
		int j = 20;
		while (j <= 40) {
			System.out.println(j);
			j++;
		}

	}
	public static void loop1() {
		int i=1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

}
	public static void loop3() {
		int k=1;
		while (k <= 5) {
			System.out.println(k);
			k++;
		}*/
		
		loop(1,10);
		System.out.println("**************************");
		loop(20,40);
		System.out.println("**************************");
		loop(1,10);

	}
   public static void loop(int step, int finalValue) {
	   
	   while(step<=finalValue) {
		   System.out.println("step");
		   step++;
	   }
   }
}
