package daily;

public class Nonprimitive1 {


		
		String s1= "Hello All";
		String s2= "Hello ";
		
		public static void main(String[] args) {
			
		Nonprimitive1 obj = new Nonprimitive1();
		System.out.println(obj.s1);
		System.out.println(obj.s1.charAt(6));
			System.out.println(obj.s1.concat(" All"));
			System.out.println(obj.s1.length());
			System.out.println(obj.s1.toLowerCase ());
			System.out.println(obj.s1.toUpperCase());
			System.out.println(obj.s1.equals(obj.s2));
			System.out.println(obj.s1.equalsIgnoreCase("hello All"));
			
			
			
			
			
			

	}

}
