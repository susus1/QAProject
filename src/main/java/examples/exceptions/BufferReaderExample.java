package examples.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BufferReaderExample {
	
	// Define a static logger variable
	private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferReaderExample example = new BufferReaderExample();
		String s = example.readFirstLine2("C:/Users/Owner/Documents/file123.txt");

	}
	
    public String readFirstLine2(String path){
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
        	logger.debug(e.getMessage());
        	logger.error(e.getMessage());
        }
        return "";
    }

    public String readFirstLine1(String path){
    	BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            return br.readLine();
        } catch (IOException e) {
            System.out.println("IOException, message is: " + e.getMessage());
        }
        finally {
        	try {
        		if (br != null) {
        			br.close();
        		}
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
        return "";
    }

}
