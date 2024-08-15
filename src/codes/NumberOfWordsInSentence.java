package codes;

import java.util.HashMap;

public class NumberOfWordsInSentence {

		public static void main(String[] args) {
			String s = " I am a student and who are you ";
			
			String a[] = s.split(" ");
			
			HashMap < String, Integer> map = new HashMap<>();
			
			int totalwords = 0; 
			for(String each: a) {
				if (map.containsKey(each)) {
					map.put(each, map.get(each)+1);
				}
				else {
					map.put(each, 1);
				}
				totalwords++;
			}
			
		
			
			System.out.println(totalwords-1);


	}

}
