package programs;

import java.util.Arrays;
import java.util.Scanner;

public class countwordsinastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String s = sc.nextLine();
		int count = 1;
		for (int i = 0; i < s.length()-1; i++) {

			if ((s.charAt(i)==' ') && (s.charAt(i+1) !=' ')) 
			{
				
				count++;

			}
		}

		System.out.println(+count);

	}

}
