package programs;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number:");
		int number = sc.nextInt();
		int rev = 0;
		int duplicate = number;
		while(number!=0) {
			rev = rev*10+number%10;
			number=  number/10;
			
		}
		
		System.out.println(rev);
if(number == duplicate) {
	System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}

	}

}
