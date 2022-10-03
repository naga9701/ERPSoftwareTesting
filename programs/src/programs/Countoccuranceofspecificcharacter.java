package programs;

public class Countoccuranceofspecificcharacter {
	
	public static void main(String[] args) {
		
		String str = "i am taking interview tommarow";
		
		int s = str.length();
		
		int s1 = str.replaceAll("a","").length();
		
		int count = s - s1;
		System.out.println("the occurance of a  is:" +count);
		
	}

}
