package codes;

public class Fibonacci {

	public static void main(String[] args) {
		int first= 0;
		int second= 1; 
		int sum =0; 
		
		int num =10; 
		
		for (int i=0; i<num; i++) {
			
			sum = first + second; 
			first = second; 
			second = sum; 
			System.out.println(sum);
			
		}
		
	}

}
