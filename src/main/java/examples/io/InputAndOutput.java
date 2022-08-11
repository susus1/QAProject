package examples.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutput {

	public void copy(String inFile, String outFile) {
		try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/" + inFile);
				FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/" + outFile);) {
			int numberOfBytesRead;
			byte[] bytesArray = new byte[128];
			while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
				fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		InputAndOutput io = new InputAndOutput();
		io.copy("photo.jpg", "copy.jpg");
	}
}