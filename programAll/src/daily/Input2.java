package daily;
import java.util.Scanner;

public class Input2 {
	
	public void addition ( )
	
	{
		Scanner obj=new Scanner (System.in);
		System.out.println("enter the amount");
	int amount=	obj.nextInt();
	System.out.println("enter the valid amount");
	int amounts=	obj.nextInt();
		if (amount%100==0)
		{
			System.out.println("enter the pin");
			
		}
		else
		{
		System.out.println("enter the valid amount");	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated meth
	Input2 obj1=new Input2();
	obj1.addition();
	
	
	}

}
