package examples.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandler {
	public static int readFromFile() throws IOException{
		int i;
		Path path = Path.of("C:/Users/Owner/Documents/file2.txt");
		
		boolean exists = Files.exists(path);
		
		String s = Files.readString(path); //checked exception
		i = Integer.parseInt(s); //unchecked exception
		return i;
	}
}
