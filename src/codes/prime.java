package codes;

public class prime {

	public static void main(String[] args) {
		

		int n= 12; 
		
		boolean b = true; 
		
		for (int i = 2; i< n ; i++) {
			if (n%i ==0) {
				b = false; 
				break;
			}
		}
		
		if (b) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not");
		}

	}

}
