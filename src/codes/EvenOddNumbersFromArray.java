package codes;

public class EvenOddNumbersFromArray {

	public static void main(String[] args) {
		
		int a [] = {1, 3, 6, 4, 8};
		
		for (int i =0; i<a.length; i++) {
			
			if (a[i] %2==0) {
				System.out.println("even");
			}
			else {
				System.out.println("Odd");
			}
		}

	}

}
