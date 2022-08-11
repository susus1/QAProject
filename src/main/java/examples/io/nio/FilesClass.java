package examples.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesClass {

	public static void main(String[] args) {
		String dir = "src/main/resources/";
		String source = "textFile.txt";
		String destination = "copiedFile.txt";
		Path from = Paths.get(dir,source);
		Path to = Paths.get(dir,destination);
		try {
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		

	}

}
