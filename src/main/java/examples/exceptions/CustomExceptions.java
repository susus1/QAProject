package examples.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomExceptions {
	
	public static void main(String[] args) {
		CustomExceptions customExceptions = new CustomExceptions();
		try {
			customExceptions.readFirstLine("c:/file.txt");
		} catch (IOException | IncorrectPathException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
		}
	}
	
    public String readFirstLine(String path) 
    		throws FileNotFoundException, IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {          
            return br.readLine();
        } catch (FileNotFoundException e) {
            if(!isCorrectPath(path)) {
                throw new IncorrectPathException("Incorrect Path : " + path, e);
            }
        }
        return "";
    }

    public boolean isCorrectPath(String fileLocation) {
    	Path path = Path.of(fileLocation);
        return Files.exists(path);
    }
    
}
