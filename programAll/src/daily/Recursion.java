package daily;

public class Recursion {

	public static int factorial (int n)
	{
		
	if (n==1)
	
		return 1;
	int result=factorial (n-1)*n;
	return result;
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Recursion.factorial(6));
		
	}

}
