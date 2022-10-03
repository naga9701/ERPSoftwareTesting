package programs;

import java.util.HashMap;

public class counteachcharacteroccurance {
	
	public static void getcharcount(String name) {
		HashMap<Character, Integer> hs  = new HashMap<Character, Integer>();
		
		char chartoarr[] = name.toCharArray();
		for(char c : chartoarr) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c,1);
			}
			
		}

	System.out.println(name+ ": "+hs);
	}

public static void main(String[] args) {
	getcharcount("nagarjuna");
	
	
	
	
}
	
	
}
