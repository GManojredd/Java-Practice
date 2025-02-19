package print;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Class1 {

	public static void main(String[] args)throws IOException {
		try {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter r1 : ");
		int R1=sc.nextInt();
		System.out.print("enter r2 : ");
		int R2=sc.nextInt();
		System.out.print("enter r3 : ");
		int R3=sc.nextInt();
float R4=(R3*R2)/R1;
		 System.out.println(R4);

		sc.close();
		Scanner vb=new Scanner(System.in);
		vb.close();
		BufferedReader fgh=new BufferedReader(new InputStreamReader(System.in));
		
		fgh.close();
	BufferedReader fgv=new BufferedReader(new FileReader("text.txt"));
		
fgv.close();}
		catch(Exception e) {
			System.err.println(""
					
					);
		}

	}}

	


