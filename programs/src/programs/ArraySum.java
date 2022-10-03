package programs;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10,20,30,40,5,60,70};
		int sum = 0;
		for(int value : arr) {
			sum = sum+value;
		}
		System.out.println(sum);

	}

}
