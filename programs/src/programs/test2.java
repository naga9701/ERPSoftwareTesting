package programs;

import java.util.HashMap;

public class test2 {

	public static void getoccurance(String str) {
		HashMap<Character, Integer> hs  = new HashMap<Character, Integer>();
		
		char chararray[] = str.toCharArray();
		for(char c : chararray) {
			if(hs.containsKey(c)) {
			hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c, 1);
			}
		}
	
	System.out.println(str +": "+ hs);
	}
	
	public static void main(String[] args) {
		getoccurance("nagarjuna");
		
	}
}
