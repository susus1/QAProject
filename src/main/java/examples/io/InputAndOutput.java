package examples.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputAndOutput {

	public static void main(String[] args) {
		InputAndOutput io = new InputAndOutput();
		try {
			io.bufferedCopy();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		io.copy("photo.jpg", "copy.jpg");
	}

	public void bufferedCopy() throws IOException {
		
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/textFile.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/newTextFile.txt"));) {
			String line;
			while ((line = br.readLine()) != null) {
				bw.write(line + "\n");
			}
		}
	}

	public void copy(String inFile, String outFile) {
		try (FileInputStream fileInputStream = new FileInputStream("src/main/resources/" + inFile);
				FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/" + outFile)
				) {
			int numberOfBytesRead;
			byte[] bytesArray = new byte[128];
			while ((numberOfBytesRead = fileInputStream.read(bytesArray)) != -1) {
				fileOutputStream.write(bytesArray, 0, numberOfBytesRead);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}