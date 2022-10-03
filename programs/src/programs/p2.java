package programs;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "Nagarjuha";
		char[] ch = str.toCharArray();
		
		int length = str.length();
		
		
		
		
		for(int i = 0;i<length-1;i++) {
			
			int count=1;
			for(int j =i+1;j<length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					for(int k=j;k<=length-1;k++) {
						ch[k] = ch[k+1];
					}
					length--;
				}
			}

		System.out.println(ch[i]+" "+count);
	}

}}
