package examples.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Runner {

	public static void main(String[] args) {

		int i = 0;
		try {
			Path path = Path.of("C:/Users/Owner/Documents/file2.txt");
			String s = Files.readString(path); //checked exception
			i = Integer.parseInt(s); //unchecked exception
			System.out.println(i);
		}
		catch (NumberFormatException e) {
			System.out.println("not a number");
		} 
		catch (IOException e) {
			System.out.println("File unavailable");
		}
		finally {
			System.out.println("allways executed");
		}
		
		System.out.println(i);
	}

}
