package daily;
import java.util.Scanner;

public class Revise {
	
	public void substraction ()
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("enter first number");
		
		int a = obj.nextInt();
		System.out.println("enter second number");

		int b=obj.nextInt ();		
		
		System.out.println(a-b);
		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Revise obj1=new Revise ();
		obj1.substraction();

	}

}
