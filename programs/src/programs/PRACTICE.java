package programs;

import java.util.Scanner;

public class PRACTICE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	Scanner sc = new Scanner(System.in);
	System.out.println("enter string:");
	
	String str = sc.nextLine();
		
		/*String[] str = originalString.split("\\s");
		
		String reverseString = "";
		for(String words:str) {
			
			String duplicateString = "";
			for(int i = words.length()-1;i>=0;i--) {
				duplicateString = duplicateString+words.charAt(i);
			}
			
			reverseString =reverseString+duplicateString+" ";
			
			
		}
		*/
		
		/*String reverseString = "";
		for(int i =originalString.length()-1;i>=0;i--) {
			reverseString = reverseString+originalString.charAt(i);
		}
		
		System.out.println(reverseString);*/
		
		//Scanner sc = new Scanner(System.in);
	//	System.out.println("enter string:");
		
		
	
		String str = "Nagarjuha";
		char[] ch = str.toCharArray();
		
		int length = str.length();
		
		
		
		
		for(int i = 0;i<length-1;i++) {
			
			int count=1;
			for(int j =i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					for(int k=j;k<=length-1;k++) {
						ch[k] = ch[k+1];
					}
					length--;
				}
			}

		System.out.println(ch[i]+" "+count);
		}
		

		
		
		
	}

}
