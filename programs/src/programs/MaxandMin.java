package programs;

public class MaxandMin {
public static void main(String[] args) {
	
	
	int []arr = {1,20,84,7,6,8,9,45,14,12,32,145,150,-2,-1};

	for(int i = 0;i<arr.length;i++) {
		for(int j = i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
		}
		System.out.print(" "+arr[i]);
	}
	System.out.println();
	System.out.println(arr.length);
	int length  =arr.length;
	System.out.println("max value is : "+arr[length-1]);
	System.out.println("min value is :"+arr[length-15]);
	

}
}
