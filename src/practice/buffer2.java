package practice;

import java.io.*;
public class buffer2 {

	public static void main(String[] args) throws IOException{
		
		        try (BufferedReader br = new BufferedReader(new FileReader("File.txt"))) {
		            String line;
		            while ((line = br.readLine())!= null) {
		                System.out.println(line);
		                
		                
		            }
		        } catch (IOException e) {
		            System.err.println("Error reading file: " + e.getMessage());
		        }
		    }
		
	

}

