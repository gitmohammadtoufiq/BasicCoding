package codes;
import java.util.*;

public class FindDuplicateCharactersInString {

	public static void main(String[] args) {
		
		String s = " I am your new friend ";
		
		char [] a = s.toCharArray();
		
		HashMap <Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char each: a) {
			
			if( map.containsKey(each)) {
				map.put(each, map.get(each)+1);
			}
			else {
				map.put(each, 1);
			}
			
			
			
		}
		
	
		map.entrySet().removeIf(i-> i.getValue()>=2);
		System.out.println(map);

	}

}
