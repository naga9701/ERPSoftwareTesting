package programs;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entre the string:");
		
		String s = sc.nextLine();
		String rev = "";
		String Duplicate = s;
		for(int i = s.length()-1;i>=0;i--) {
			rev =rev+s.charAt(i);
		}
		
		System.out.println(rev);
		if(rev.equals(Duplicate)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		/*
		StringBuffer sb = new StringBuffer(s);
		StringBuffer rv = sb.reverse();
		System.out.println(rv);
*/
	}

}
