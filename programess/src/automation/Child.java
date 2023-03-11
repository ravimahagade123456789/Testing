package automation;

public class Child implements Inter {
public	void nepal ()
	{
		System.out.println("nepal");
	}
public void china ()
{
	System.out.println("china");
}
public void bharat ()
{
	System.out.println("bharat");
}
public void england ()
{
	System.out.println("england");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Child obj = new Child ();
   obj.nepal ();
   Inter obj=new Inter ();
	obj.addition ();	   
		   
	}

}
