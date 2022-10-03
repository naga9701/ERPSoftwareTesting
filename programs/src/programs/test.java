package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class test {
	
	public static void getoccurance(String str) {
	HashMap<Character,Integer> hs = new HashMap<Cghagers,
	
	}
	public static void main(String[] args) {

	
		//int []arr = {10,8,1,89,3,13,78,41,3};
	/*
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number:");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = 1;i<=num;i++) {
			fact  = fact*i;
		}
		System.out.println(fact);
		
		/*for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {

					System.out.println("duplicate element "+arr[i]);
					//int temp = arr[i];
					//arr[i] = arr[j];
					//arr[j] = temp;
				}
			}
			//System.out.print(" "+arr[i]);
		}
		//int size = arr.length;
		
		//System.out.println();
		//System.out.println(arr[size-2]);
		
		
		
	/*	 
String replacedString = str.replaceAll("[^a-zA-Z0-9]", "");
System.out.println(replacedString);
*/
		
		/*
		String replace = str.replaceAll("\s", "");
	System.out.println(replace);
	*/
		/*
		int len = str.length();
		int replace = str.replaceAll("a", "").length();
		int count = len - replace;
		System.out.println("occurance of a is : "+count);
	
	*/
		//getoccuranceofeachcharachter("nagarjuna");
		//getoccuranceofeachcharachter("software");
	/*	
		String str = "hi  i am good  good after noon";
		int count = 1;
		for(int i = 0;i<str.length();i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
				
			}
		}
		System.out.println(count);
		*/
		
		
		
	}
	/*public static void getoccuranceofeachcharachter(String str) {
		
		
		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
		char chararray[] = str.toCharArray();
		for(char c : chararray) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
				
			}
			else {
				hs.put(c, 1);
			}
		}
		
		System.out.println(str +" : "+hs);
		
	}
	
	*/
}
