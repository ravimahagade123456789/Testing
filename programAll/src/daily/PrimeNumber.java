package daily;

public class PrimeNumber {
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
   int n=14;
   int temp=0;
        for (int i=2;i<n-1;i++)
        {
            if (n%i==0)
            {
            	temp=temp+1;
            
          
            }
        }    
            if (temp>0)
            {
            	System.out.println("not prime");
            }
            else
            {
            	System.out.println("prime");
	
}
//            int rows = 5;
//    		System.out.println("## Printing the pattern ##");
//    		for (int i = 1; i <= rows; i++) 
//                    { 
//                            for (int j = rows; j > i; j--)
//    			{
//    				System.out.print(" ");
//    			}
//
// 			for (int k = 1; k <= i; k++)
//   			{
//				System.out.print("*");
// 			}
//    			System.out.println();
//    		}
//	

    		int rows = 5;
    		System.out.println("## Printing the pattern ##");
    		for (int i = 1; i <= rows; i++)
    		{
    			for (int j = 1; j <= i; j++)
    			{
    				System.out.print("* ");
    			}
    			System.out.println();
    		}
    		for (int i = 1; i <= rows - 1; i++) 
                    {
                            for (int j = rows - 1; j >= i; j--)
    			{
    				System.out.print("* ");
    			}
    			System.out.println();
                    }
	
    		int roo = 5;
    		System.out.println("## Printing the pattern ##");
    		for (int i = 1; i <= rows; i++) 
                    {
                            for (int j = rows; j > i; j--)
    			{
    				System.out.print("  ");
    			}
    			for (int k = 1; k <= i; k++)
    			{
    				System.out.print("* ");
    			}
    			System.out.println();
    		}

    		for (int i = 1; i <= roo - 1; i++)
    		{
    			for (int j = 1; j <= i; j++) 
                            { 
                                    System.out.print(" "); 
                            } 
                            for (int k = roo - 1; k >= i; k--)
    			{
    				System.out.print("* ");
    			}
    			System.out.println();
    		}
}
}