package programs;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	primecheck(9);
	primecheck(13);
	
	primecheck(2);
	
	primecheck(5);
	
	primecheck(19);
	
	primecheck(15);
	
	
	}
		
	public static void  primecheck(int num) {
		int count = 0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
				}
				if(count==2) {
					System.out.println("prime");
				}
				else {
					System.out.println("not prime");
				}
			}
		
		else {
			System.out.println("not prime");
		}
	}


}