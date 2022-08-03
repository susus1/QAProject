package examples.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferReaderExample example = new BufferReaderExample();
		String s = example.readFirstLine("C:/Users/Owner/Documents/file.txt");
	}
	
    public String readFirstLine(String path)  {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            return br.readLine();
        } catch (IOException e) {
            System.out.println("IOException, message is: " + e.getMessage());
        }
        return "";
    }

}
