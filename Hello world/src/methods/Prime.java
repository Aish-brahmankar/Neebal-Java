package methods;

public class Prime {
     public static void main(String[] args) {
	
}
     
     public boolean isPrime(int num) {
    	 int num=7;
    	 int temp;
    	 boolean isPrime = true;
    	 for(int i = 2; i<num/2;i++) {
    		 temp=num%2;
    		 if(temp==0) {
    			 isPrime=false;
    			 break;
    		 }
    	 }
    	 return isPrime;
     }
     
     public boolean isPrime(double doubleValue) {
    	 int num=7;
    	 int temp;
    	 boolean isPrime = true;
    	 for(int i = 2; i<num/2;i++) {
    		 temp=num%2;
    		 if(temp==0) {
    			 isPrime=false;
    			 break;
    		 }
    	 }
    	 return isPrime;
     }
    
     
     
     
     
     
     
     
}
