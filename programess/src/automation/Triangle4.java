package automation;

public class Triangle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		for (int i=0;i<=n;i++)
		{
			for (int j=0;j<=i;j++) 
			{
			 System.out.print(" ");
			}
			for(int k=n;k>=i;k--) {
				 System.out.print("*");
			}
			 System.out.println();
		}

		
		for (int i=1;i<=n;i++)
		{
			for (int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			
		    for(int k=0;k<=i;k++)
		     {
			    System.out.print("*");
		     }
		System.out.println();	
		}
		
	
		
		
	}

}
