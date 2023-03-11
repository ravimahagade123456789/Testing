package automation;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("eneter word");
		String ss=scan.nextLine();

		//String arr[]=ss.split(" ");
		for (int i=0;i<ss.length();i++)
		{
			for (int j=i+1;j<ss.length();j++)
			{
				Object[] arr = null;
				if (arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
