package daily;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "madam";
	int length = s1.length ();
	String rev =" ";			
			for (int a=length-1;a>=0;a--)	
			{
				rev=rev+s1.charAt(a);
			}
		if (rev.equals(s1))
				{
			System.out.println("its pallendrome");
				}
		
		else
		{
			System.out.println("its not pallendrome");
		}
		
	//Or 	
	}

}
;