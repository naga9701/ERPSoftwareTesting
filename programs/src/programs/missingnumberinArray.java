package programs;

public class missingnumberinArray {

	
	
	public static void main(String[] args) {
		
		int sum1 = 0;
		int [] arr = {1,2,3,4,5,6,7,9,10};
		for(int i = 0;i<arr.length;i++) {
			sum1 = sum1+arr[i];
		}
		System.out.println("sum of first array "+sum1);
		int length  =arr.length;
		System.out.println(arr[length-2]);
		
		int sum2 = 0;
		for(int i =1;i<=10;i++) {
			sum2 = sum2+i;
		}
		
		System.out.println("sum of sum2 "+sum2);

		System.out.println("the missing number is " +(sum2-sum1));
	}
}
