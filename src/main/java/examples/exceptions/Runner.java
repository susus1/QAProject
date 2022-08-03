package examples.exceptions;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Runner {

	public static void main(String[] args) {

		try {
			Path path = Path.of("C:\\Users\\Owner\\Documents\\Java");
			String s = Files.readString(null); //checked exception
			int i = Integer.parseInt(s); //unchecked exception
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {

		}

		finally {
			System.out.println("allways executed");
		}

	}

}
