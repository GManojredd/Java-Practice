package folder;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;

public class Thetotal {
            
	public static void main(String[] args)throws IOException {
BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
float qwe;
String rty;
try {
	System.out.println("the string :");

	rty =r.readLine();
	System.out.println("the string "+ rty);

	System.out.println("the num :");

	qwe=Integer.parseInt(r.readLine());
	System.out.println("the num "+ qwe);
	}

catch(Exception e) {
	r.close();
}
	}

}
