package daily;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  int no=153;
	int t1=no;int length=0;
	while (t1!=0)
	
	{
		t1=t1/10;
		length=length+1;			
	}
	int t2=no;
	int rem;
	int mult=1;
	int arm=0;
	while(t2!=0) 
	{
	rem=t2/10;	
		
	
	for (int i=1;i<=length;i++)
	{
		mult=mult*rem;
		
	}
	arm =arm+mult;
	t2=t2/10;
	}
	if(no==arm)	
		{
			System.out.println("no is armstrong");
		}
		
		
		
	}

}
