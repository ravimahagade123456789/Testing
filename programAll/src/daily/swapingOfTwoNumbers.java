package daily;

public class swapingOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	int a =10;
	int b= 25;
	a=a+b;
	b=a-b;
	a=a-b;
		
	System.out.println("the value of a  " +a  +b);	
		
	// Swapping of two numbers without using third variables
		
	    int c=45;
		int d=67;
		int e;
		e=c;
		c=d;
		d=e;
		
		System.out.println(d);
	}

}
