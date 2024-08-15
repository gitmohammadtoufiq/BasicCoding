package codes;

import java.util.Arrays;

public class findElementInArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7 };

		int n = 6;
		// Arrays.sort(a);
		// Arrays.toString(a);
		// System.out.println(a[3]);

		boolean b = false;
		for (int i = 0; i < a.length; i++) {

			if (a[i]==n) {
				b = true;
				break;
			}

		}
		
		if (b) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}

	}

}
