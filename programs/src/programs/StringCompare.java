package programs;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  FirstString = "my Name is aj";
		String SecondString = "My name is AJ";
		
		System.out.println("string compare : " +FirstString.equals(SecondString));
		System.out.println(FirstString.equalsIgnoreCase(SecondString));
	}

}
