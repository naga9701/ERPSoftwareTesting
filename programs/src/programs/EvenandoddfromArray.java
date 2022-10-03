package programs;

public class EvenandoddfromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {2,3,4,65,7,5,4,7,2,74,1,6,4};
		
		
		System.out.println("evennumbers:");
		for(int i = 0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				System.out.print(" "+arr[i]);
			}}
		
		System.out.println();
		System.out.println("odd numbers:");
		
		for(int i  = 0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				System.out.print(" "+arr[i]);
			}
		}
		}
	}


