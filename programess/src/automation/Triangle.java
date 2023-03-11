package automation;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ;
         int i,j;
         for (i=1;i<=5;i++)
         {
        	 for(j=1;j<=i;j++)
        	 {
        		 if(j==1||i==j||i==5)
        		 {
        			 System.out.print("* ");
        			 
        		 }
        		 else
        		 {
        			 System.out.print(" ");
        		 }
        	 }
    System.out.println();    	 
		
         }	
         
         
         
         int n=7;
         
         for (int k;i<=n;i++)
         {
        	 for (j=1;j<=n;j++)
        	 {
        		 if(i==n/2+1||j==n/2+1||i==j||i+j==n+1)
        		 {
        			 System.out.println(" ");
        		 }
        	 
        	   else
        	   {
        	 System.out.println("* ");
         }
	}
        	 
System.out.println();
}
	}
}
