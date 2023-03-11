package daily;

public class Duplicates_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String arr[]= {"java","c","java","c++"};
		boolean flag=false;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
//		if(flag==false)
//		{
//			System.out.println("duplicates not found");
//		}
		
	}

}
