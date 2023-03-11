package daily;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int no=123;
            int rev=0;
           
           
            int rem;
            
            while(no!=0)
            {
            	rem=no%10;
            	rev= rev*10+rem;
            	no=no/10;
            }
            System.out.println(rev);
            
     // for checking pallendrome;
            
            
            
         int num=1221;
         int reve=0;
         int rema;
         int temp=num;
         
         while (temp!=0)
         {
        	 rema=temp%10;
        	 reve=reve*10+rema;
        	 temp=temp/10;
  
        	 
         }
         if (num==reve)   
         {
        	 System.out.println("pallendrome number");
         }
         else
         {
        	 System.out.println("not a pallendome number");
         }            
            
	}

}
