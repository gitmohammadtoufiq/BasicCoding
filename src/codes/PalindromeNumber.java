package codes;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Integer num = 243; 
		
		String s = num.toString();
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		String rev = sb.toString();
		
		if (s.equals(rev)) {
			System.out.println("palindrome");
		}
		
		else {
			System.out.println("not");
		}
		

	}

}
