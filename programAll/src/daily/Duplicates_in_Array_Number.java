package daily;

public class Duplicates_in_Array_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[ ]= {5,2,8,2,1,4,4};
	int count =0;
	boolean flag=false;
	for (int i=0;i<arr.length;i++)
	{
	
	   for (int j=i+1;j<arr.length;j++)
	   {
		if (arr[i]==arr[j])  
		
		{
			System.out.println(arr[j]);
		}
	
		}
	}
	
	
	
	
	int bf [ ]= {8,9,9,45,7};
	for (int k=0;k<bf.length;k++)
	{
		
		for(int l=k+1;l<bf.length;l++)
		{
			if (bf[k]==bf[l])
			{
				System.out.println(bf[l]);
			}
		}
		
	}
	
			
			
	   }
	   
	   
	   
	}


