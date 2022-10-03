package programs;

public class linearSearch {
	
	public static void main(String[] args) {
		int num = 30;
		int []arr = {10,20,30,40,50};
		for(int i = 0;i<arr.length;i++) {
			//for(int j = i+1;j<arr.length;j++) {
				if(num == arr[i]) {
					System.out.println("element found "+arr[i]+" at index "+i);
				}
			//}
		}
		
	}

}
