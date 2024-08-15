package codes;

public class EvenOddFromArray {

	public static void main(String[] args) {
		int a [] = {1, 3, 2, 4, 5, 6};
		
		for (int i=0 ; i<a.length; i++) {
			if (a[i]%2==0) {
				System.out.println(a[i] + ": is EVEN");
			}
			else {
				System.out.println(a[i] + ": is odd");
			}
		}

	}

}
