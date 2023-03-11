package automation;

public class TriangleAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha=65
		int n=5;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha + j - 1 )+ " ");
			}
			
			System.out.println();
		}
		
		
		
		
			
	}

}
