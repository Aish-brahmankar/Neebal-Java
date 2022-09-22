package study;

import java.util.ArrayList;

public class App1 {
	
	
	static ArrayList<String> listnames = new ArrayList<>(); 
	
	public static void main(String[] args) {
	
		listnames.add("Aishwarya");
		listnames.add("john");
		listnames.add("mike");
		listnames.add("nick");
		listnames.add("sai");
		listnames.add("gen");
		App1 app1 = new App1()	;
		app1.displayList(listnames);
		app1.removeNameByPosition(0);
		
	}
	void displayList(ArrayList<String> names) {          //Displaying the function
		for(String name : names) {
			System.out.println(name);
		}
		
	}
	void removeNameByposition(int position) {              //remove the function
           listnames.remove(0);                                 
}
	void removeNameByString(String name) {
		

	}

}