package programs;

import java.util.Arrays;
import java.util.HashSet;

public class duplicateelementinarray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 30, 40, 50, 2, 41, 50, 30 };
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate element found:" + arr[i]);
				}

			}
		}

		HashSet<Integer> hs  = new HashSet<Integer>();
	/*	
		System.out.println(hs.add(10));
		System.out.println(hs.add(20));
		System.out.println(hs.add(10));
		
		*/
		
		for(int i : arr) {
			
			System.out.println(hs.add(i));
			
		}
 		
		
	}
}
