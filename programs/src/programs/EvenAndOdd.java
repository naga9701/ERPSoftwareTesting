package programs;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number:");
		int number = sc.nextInt();
		int evencount = 0;
		int oddcount = 0;
		
		while(number>0) {
			int rem = number%10;
			if(rem%2==0) {
				System.out.println("even numbers:"+rem);
				evencount++;
				
				
			}
			else {
				System.out.println("odd numbers:"+rem);
				oddcount++;
					}
		
		number = number/10;
		}
		System.out.println("evencount:"+evencount);
		System.out.println("oddcount:"+oddcount);

	
	}

}
