package initialize;

public class Reference {
public static void main(String[] args) {
	String[] names = {"juhi","anu","ria","jhon","steve"};
	Reference reference = new Reference();                 //main method
	reference.displayNames(names);                         //calling tha names
	System.out.println("**********************");
	System.out.println(names[0]);
	
}

   void displayNames(String[] names) {
	   names[0] = "jhon";
	   for(String name : names) {                 //displayNames method / call method
		 System.out.println(name);             
	   }
	   
   }
}
