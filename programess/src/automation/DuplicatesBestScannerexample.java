package automation;

import java.util.Scanner;

public class DuplicatesBestScannerexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Size,i,j,dupcount=0;
Scanner scan =new Scanner(System.in);
Size =scan.nextInt();
		int []dupcountarr=new int[Size];
System.out.println("\n please enter duplicate array:");		
		System.out.format("enter duplicatr array elements",Size);
		for(i=0;i<Size;i++) {
			for(j=i+1;j<Size;j++) {
				if(dupcountarr[i]==dupcountarr[j]) {
					dupcount++;
					break;
				}
			}
		}
		
		
	System.out.println("total no of duplicates"+dupcount);	
		
	}

}
