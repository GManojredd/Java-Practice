package practice;
import java.io.*;

public class Date {

	static void man() {
		System.out.println("1");
		 
	}
	static void person() {
		System.out.println("2");
	}
	static void human(int i) {
		System.out.println(i);
	}
	static void boy(String j) {
		System.out.println(j);
	}
	static void boy(int i,String j) {
		System.out.printf("%d and %s ",i,j);
		System.out.println();
	}
		
	public static void main(String[] args)throws IOException {
		man();
	      person();
	      human(3);
	      boy("the first");
	      boy(4,"the last ");
	//	BufferedReader h=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader l=new BufferedReader(new FileReader("File.txt"));
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int gh;
		try {
			System.out.print("enter  val :");
			gh=Integer.parseInt(k.readLine());


		while((line=l.readLine())!=null) {
			System.out.println(line);
		}}
		catch(Exception e) {

		
		}
		// TODO Auto-generated method stub
      
      
	}

}
