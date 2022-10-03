package programs;

import java.util.Arrays;

public class sortingArray {
public static void main(String[] args) {
	
	int[] arr = { 1, 2, 30, 40, 50, 2, 41, 50, 30 };
	
	for(int i = 0;i<arr.length;i++) {
		Arrays.sort(arr);
		System.out.print(" "+arr[i]);
	
	
	}
	System.out.println();
	System.out.println(Arrays.binarySearch(arr, 40));
	
	
	
}
}
