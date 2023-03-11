package automation;

public class Complete extends Result {
	
	int a=98;
	int b=104;
	int c =a*b;
	
	public void addition()
	{
		int a=10;
		int b=30;
		int C = a+b;
		System.out.println(C);
	}
	
	public void china ()
	{
		System.out.println("pratik");
	}
	public void nepal ()
	{
		System.out.println("i am robot");
	}
	public void newyork ()
	{
		System.out.println("good morning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Complete obj=new Complete ();
obj.addition();
obj.substraction();
System.out.println(obj.c);
obj.mult();
obj.china ();
obj.nepal ();


	}
	

}

