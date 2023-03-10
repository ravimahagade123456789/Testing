import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
////		String original, reverse = ""; // Objects of String class  
////	      Scanner in = new Scanner(System.in);   
////	      System.out.println("Enter a string/number to check if it is a palindrome");  
////	      original = in.nextLine();   
////	      int length = original.length();   
////	      for ( int i = length - 1; i >= 0; i-- )  
////	         reverse = reverse + original.charAt(i);  
////	      if (original.equals(reverse))  
////	         System.out.println("Entered string/number is a palindrome.");  
////	      else  
////	         System.out.println("Entered string/number isn't a palindrome.");   
////	      
	      
////	      
//		int n=5;
//		for(int i=0;i<=n;i++)
//		{
//		for(int j=0;j<=i;j++)
//		{
//		  System.out.print(" ");
//		 }
//		for (int k=n;k>=i;k--)
//		{
//		System.out.print("*");
//		}
//		System.out.println();
//		}
//		
		String s="ashaaahyduds";
		int a=s.length();
		int b=s.replace("a", "").length();
		int c=a-b;
		System.out.println(c);}}
//		
//		
		
//		String str = "Sssdnruruhurvu vunruerierjennrvnrnejnver";
//	      HashMap <Character, Integer> hMap = new HashMap<>();
//	      for (int i = str.length() - 1; i >= 0; i--) {
//	         if (hMap.containsKey(str.charAt(i))) {
//	            int count = hMap.get(str.charAt(i));
//	            hMap.put(str.charAt(i), ++count);
//	         } else {
//	            hMap.put(str.charAt(i),1);
//	         }
//	      }
//	      System.out.println(hMap);
		
		
		//maximum occurenece of characters in string
		
		
//	      Scanner in = new Scanner(System. in);
//	      String k = in.nextLine();
//	      char tempArray[] = k.toCharArray(); 
//	        Arrays.sort(tempArray); 
//	        String s = new String(tempArray);
//	        int n = s.length();
//	        int max_count = 0;
//	        int count = 1;
//	        char ans = '-';
//	        for (int i = 1; i <= n; i++)
//	        {
//	            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
//	            {
//	                if (max_count < count)
//	                {
//	                    max_count = count;
//	                    ans = s.charAt(i-1);
//	                }
//	                count = 1;
//	            }
//	            else
//	            {
//	                count++;
//	            }
//	        }
//	    System.out.println("Maximum occurring character is "+ans);
//	    
//	    
//	    // minimum occurence of characters in string
//	  
//	    String minOccStr;
//		int i, min;
//		
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("\nEnter String to find Minimum Char Occurrence =  ");
//		minOccStr = sc.nextLine();
//		
//		int[] charFreq = new int[minOccStr.length()];
//		char[] minOccArr = minOccStr.toCharArray();
//		char minChar = minOccStr.charAt(0);
//		
//		for(i = 0; i < minOccArr.length; i++)
//		{
//			charFreq[i] = 1;
//			for(int j = i + 1; j < minOccArr.length; j++) {
//				if(minOccArr[i] == minOccArr[j] && minOccArr[i] != ' ' && minOccArr[i] != '0') {
//					charFreq[i]++;
//					minOccArr[j] = '0';
//				}
//			}		
//		}
//		min = charFreq[0];
//		for(i = 0; i < charFreq.length; i++) 
//		{
//			if(min > charFreq[i] && charFreq[i] != '0') {
//				min = charFreq[i];
//				minChar = minOccArr[i];
//			}
//		}
//		System.out.println("\nThe Minimum Occurring Character = " +  minChar);
//		System.out.format("'%c' Character Occurs %d Times ", minChar, min);
//
//		}
//	}
//
//
