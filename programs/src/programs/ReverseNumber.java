package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = sc.nextInt();
		int reverse = 0;
		
		 while(number!=0) { reverse = reverse*10+number%10; number = number/10; }
		 

		// 2nd approach
		
		  StringBuffer sb = new StringBuffer(String.valueOf(number)); 
		  
		  StringBuffer rev1 = sb.reverse();
		  
		  System.out.println(rev1);
		 

		
		  StringBuffer Sb = new StringBuffer(number); Sb.append(number); 
		  StringBuffer rev = Sb.reverse();
		  
		  System.out.println(rev);
		 
		
		 StringBuilder s1 = new StringBuilder(number); s1.append(number);
		 StringBuilder re = s1.reverse(); System.out.println(re);
	 
	}
	
}
