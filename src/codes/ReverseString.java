package codes;

public class ReverseString {

	public static void main(String[] args) {
		String s = "new";
		
		String output = "";
		
		for (int i = s.length()-1; i>=0; i --) {
			output = output + s.charAt(i);
		}
		System.out.println(output);

	}

}
