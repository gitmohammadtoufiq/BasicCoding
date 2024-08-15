package codes;
import java.util.*;

public class FindUniqueCharactersInString {

	public static void main(String[] args) {
		String s = " I am a student ";
		
		char c [] = s.toCharArray();
		
		HashMap < Character, Integer> map = new HashMap<>();
		
		
		for(char each: c) {
			if (map.containsKey(each)) {
				map.put(each, map.get(each)+1);
			}
			else {
				map.put(each, 1);
			}
		}
		
		map.entrySet().removeIf(i->i.getValue()>1);
		System.out.println(map);

	}

}
