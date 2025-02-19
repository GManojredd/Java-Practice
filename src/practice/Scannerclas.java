package practice;

import java.util.Scanner;

public class Scannerclas {

	public static void main(String[] args) {
		Scanner sjc=new Scanner(System.in);
		
		try {
		System.out.print("Enter string");
		String bv=sjc.nextLine();
		System.out.println("Enter take :"+bv);
		System.out.println("Enter boolean");
		boolean df=sjc.nextBoolean();
		System.out.println("Enter this :"+df);
		System.out.println("Enter byte");
		byte as=sjc.nextByte();
		System.out.println("Enter take :"+as);
	    System.out.println("Enter long");
     	long ad=sjc.nextLong();
		System.out.println("Enter take :"+ad);
		System.out.println("Enter short");
		short af=sjc.nextShort();
		System.out.println("Enter take :"+af);
		System.out.println("Enter char");
		char ag=sjc.next().charAt(1);
		System.out.println("Enter take :"+ag);
		System.out.println("Enter float");
			float ah=sjc.nextFloat();	
			System.out.println("Enter take :"+ah);
			System.out.println("Enter double");
			double aj=sjc.nextDouble();	
		System.out.println("Enter take :"+aj);
			

			}
		catch(Exception e) {
			
		}
		sjc.close();
		
	}

}
