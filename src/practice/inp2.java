package practice;

import java.io.*;
public class inp2 {

	public static void main(String[] args) throws IOException{
		BufferedReader nb=new BufferedReader(new InputStreamReader(System.in));
		String cv;
		int fd;
	
		try {
			System.out.print("enter the value : ");
		 cv=nb.readLine();
		 System.out.println("value : "+ cv);
		 System.out.print("enter this : ");
		 fd=Integer.parseInt(nb.readLine());
		 System.out.println("value is : "+ fd);
		 System.out.println(cv.length());
	//	 ty=nb.readLine();
		}
		catch(Exception e) {
			
			
		}
		// TODO Auto-generated method stub

	}

}
