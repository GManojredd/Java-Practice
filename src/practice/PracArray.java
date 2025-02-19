package practice;
import java.io.*;
import java.util.Scanner;

public class PracArray {

	Scanner sc=new Scanner(System.in);
	
	
	int x = 11;
	    private int y = 33;
	    public void method1()
	    {
	     PracArray t = new PracArray();
	        this.x = 22;
	        y = 44;

	        System.out.println("Test.x: " + x);
	        System.out.println("t.x: " + t.x);
	        System.out.println("t.y: " + t.y);
	        System.out.println("y: " + y);
	    
	    int []a;
	    a=new int[3];
	    a[0]=4;
	    a[1]=5;
	    a[2]=6;
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	    }
	    for(int h:a) {
	    	System.out.println
	    	(h);}
	    	System.out.println
	    	(a.length);
	    
	    char [][]b=new char[2][2];
	    b[0][0]='g';
	    b[0][1]='s';
	    b[1][0]='d';
	    b[1][1]='b';
	    for(char[] c:b) {
	    	
	    	System.out.println(c[0]);
	    	System.out.println(c[1]);

	    }
	    for(int i=0;i<b.length;i++) {
	    	for(int j=0;j<b[i].length;j++) {
	    		
	    	
	    	System.out.println(b[i][j]);
	    }
	    }
	    int[][][]d=new int[2][2][2];
	    d[0][0][0]=1;
	    d[0][0][1]=2;
	    d[0][1][0]=3;
	    d[0][1][1]=4;
	    
	    d[1][0][0]=5;
	    d[1][0][1]=6;
	    d[1][1][0]=7;
	    d[1][1][1]=8;
	    for(int k[][]: d) {
	    	System.out.println(k[0][0]);

	    	System.out.println(k[0][1]);
	    	System.out.println(k[1][0]);
	    	System.out.println(k[1][1]);

	    }
	    }
	   
	




	    public static void main(String args[])
	    {
	        PracArray t = new PracArray();
	        t.method1();
	    }
	
	}

