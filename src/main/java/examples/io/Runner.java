package examples.io;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Runner {

	public static void main(String[] args) {
		String directory = "C:/Users/Owner/Documents";
		Path source = Paths.get(directory, "file.txt");
		Path destination = Paths.get(directory, "copy.txt");
		try {
			Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
