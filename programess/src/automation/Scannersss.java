package automation;

import java.util.Scanner;

public class Scannersss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner (System.in);
		System.out.println("enter word");
		String ss= scan.nextLine();
		String rev = "";
		
		for (int i=ss.length()-1;i>=0;i--)
		{
			 rev = rev+ss.charAt(i);
		}
		System.out.println(rev);
		
	

}
}