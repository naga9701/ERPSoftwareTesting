package programs;

public class Test1Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;

		System.out.println("the values before swapp:" + a + " " + b);
/*
		int temp;
		temp = a;
		a = b;
		b = temp;
*/
		
		
		
		//2nd approach
		
		
		/*a = a + b;
		b  = a-b;
		a = a-b;
		
		*/
		//3rd approach
		
		
		a = a*b;
		b = a/b;
		a= a/b;
		
		
		System.out.println("after swap:" + a + " " + b);
		
		

	}

}
