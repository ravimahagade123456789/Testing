package daily;
import java .util.Scanner;


public class EvenOdd {
	

		// TODiO Auto-generated method stub
	
		public void addition()
		{
		Scanner obj=new Scanner (System.in);
		System.out.println("enter number");
		int n=  obj.nextInt()   ;   
		
		      if (n%2==0)
		         {
			        System.out.println("even number");
			
		          }
		      else
		          {
			        System.out.println("odd number");
		          }
		}  
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	   EvenOdd obj1=new EvenOdd ();
	   obj1.addition();
	    

		}
}