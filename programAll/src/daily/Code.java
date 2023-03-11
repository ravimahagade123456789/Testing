package daily;

public class Code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String s= "aaasdhdhgdydhbd";
//		char [] a= s.toCharArray();
//		
//		int count=0;
//		
//		for (int i=0;i<a.length;i++)
//		{
//			count=1;
//			
//			for(int j=i+1;j<a.length;j++)
//			{
//			   if(a[i]==a[j]&&a[i]!=' ') {
//				   
//				   count++;
//				   a[j]='0';
//				   	   
//			   }
//				
//			
//			}
//		if(count>1&&a[i]!='0')
//		{
//			System.out.println( a[i]);
//		}
//		
//		
//		
//		
//		
//		}
//		
//		
//		
			
     	String s= "abdfuhfh fbfbf fhff jff ";
		int counter [] = new int [256];
	
		
		for(int i=0;i<s.length();i++) {
			
			counter[(int)s.charAt(i)]++;
		}
	
		for (int i=0;i<256;i++)
		{
			if (counter[i]!=0)
			{
				System.out.println((char) i+"~~~~~~~~~~~~" + counter[i]);
			}
		}
		
		
		System.out.println(s.split("\\s+").length);
		
		
		
		
		
		
		
		
	}

}
