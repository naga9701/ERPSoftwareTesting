package programs;

public class removeWhiteSpaces {
	
	
	public static void main(String[] args) {
		
		String str = "i am    taking intervirew";
		
		str = str.replaceAll("\s", "");
		System.out.println(str);
		
		
	}

}
