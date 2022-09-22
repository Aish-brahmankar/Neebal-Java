package initialize;

public class Call {
	
	public static void main(String[] args) {
		int value = 10;
		System.out.println("Current value of main method is "+value);
		Call call = new Call();
		call.displayValue(value);
		
		System.out.println("Current value of main method is "+value);
	}
	
	void displayValue(int value) {
		System.out.println("Current value of variable in displayValue method is "+ value);
		value = 20;
		System.out.println("Current value of variable in displayValue method is "+ value);
	}

}
