package codes;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		int a [] = {20, 3, 4, 10, 15};
		
		//ascending
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		//System.out.println(a);
		
		//descending
		Integer b[] = {20, 30, 10, 29, 15};
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
	
	}

}
