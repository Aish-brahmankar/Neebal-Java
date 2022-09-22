package methods;

public class Sum {
	public static void main(String[] args) {
		System.out.println("1+2="+sum(1,2));
		System.out.println("1+2.5="+sum(1,2.5F));
		System.out.println("1.3+2.3="+sum(1.3,2.3F));
		
	}
	public static int sum(int x, int y) {
		System.out.print("Adding two int entities :");
		return x+y;
	}
	
	public static float sum(int x, float y) {
		System.out.print("Adding 1 int and 1 float entities  :");
		return x+y;

}
	public static double sum(double x, double y) {
		System.out.print("Adding 2 double entities  :");
		return x+y;

}

}