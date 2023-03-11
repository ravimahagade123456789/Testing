package daily;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a [] = {4,4,4,4,6,8,9,2};
	
         
         for (int i = 0; i<a.length;i++)
           {
              for (int j=i+1;j<a.length;j++)
               {
                 if (a[i]==a[j])
                   {
                System.out.println(a[j]);
                    
                    } //System.out.println (count);
               }
              
             }
	
		
//         int arr[ ]= {5,2,8,2,1,4,4};
//     	boolean flag=false;
//     	for (int i=0;i<arr.length;i++)
//     	{
//     	
//     	   for (int j=i+1;j<arr.length;j++)
//     	   {
//     		if (arr[i]==arr[j])   
//     		{
//     			System.out.println(arr[j]);
//     		}
     	
     		}
		
		
	}


