package codes;

import java.io.*;

public class ReadFromAFile {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

		String line; 
		
		
		while((line = reader.readLine())!= null) {
			System.out.println(line);
		}
		reader.close();
	}
	

}
