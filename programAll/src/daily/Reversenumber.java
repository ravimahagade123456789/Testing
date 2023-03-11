package daily;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int rem;
	    int num1 = 234;
		int rev=0;
	int temp=num1;
		
		while (temp>0)
		
		{
			//Scanner scan= new Scanner(System.in);
			//System.out.println("enter the num1");	
			//int num11 =scan.nextInt();
			rem =temp%10;
			rev=rev*10+rem; 
			temp=temp/10;
			
		
		}
		if (num1==rev)
		{
			System.out.println("p");
		}
		else {
			System.out.println("np");
		}
		
		System.out.print(rev);
	}

}
