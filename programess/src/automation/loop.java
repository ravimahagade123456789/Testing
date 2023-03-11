package automation;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=85;
int b=0;
int c=a+b;
System.out.println(c);

       for (int i=0;i<=3;i++)
       {
           for (int j=0;j<=i;j++)
           {
                 System.out.print("*");

	        }
     System.out.println();
       } 
             for (int i=0;i<=4;i++)
             {
                  for (int j=4;j>=i;j--)
                  {
                	  System.out.print("*");
                  }
                  System.out.println();
                  }
             
             System.out.println("------------------------------------");
             
             for (int i=0;i<=4;i++)
             {
            	 for(int j=0;j<=4;j++)
            	 {
            		 
            		 System.out.print(" *");
            		 System.out.print(" ");
            	 }
            	 System.out.println();
            	 System.out.println("  ");}
       System.out.println("-----------------------------------------------------------------------------");
          
          for (int i=0;i<=3;i++)
          {
        	  for (int j=4;j>=i;j--)
        	  {
        		  System.out.print(" ");
        	  }
        	      for (int k=0;k<=i;k++)
        	      {
        	    	System.out.print("*");  
        	      }
        	      System.out.println();
        	      
          }
       
       System.out.println("---------------------------------------------------------------------------");
       
       for (int i=0;i<=3;i++)
       {
    	   for (int j=3;j>=i;j--)
    	   {
    		   System.out.print(" ");
    	   }
    	   for (int k=0;k<=3;k++)
    	   {
    		   System.out.print(" *");
    	   }
    	   System.out.println();
    	   
    	   
    	   
       }
       
   System.out.println("-------------------------------------------");    
           
   for (int i=0;i<=10;i++)
   {
	   for (int j=10;j>=i;j--)
	   {
		   System.out.print(" ");
	   }
	   for (int k=0;k<=i;k++)
	   {
		   System.out.print(" *");
	   }
	   System.out.println();
	   
   }	   
       
       
}
}