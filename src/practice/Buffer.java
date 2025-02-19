package practice;

import java.io.*;
 class ram{
	
   public String f;
 public  int g;
	public ram(String f,int g) {
		this.f=f;
		this.g=g;
			}
	public String getF() {
		return f;
	}
	public int getG() {
		return g;}
	public void hjggk(String h,int j) {
		System.out.println(h);
		System.out.println(j);

	}
	public void hjggk(String h) {
		System.out.println(h);

	}
	
	
}
interface kala{
	void sd();
	int xc();
}
abstract class one{
	abstract void hjk();
	abstract String hjl();
}
class two extends one implements kala{
	 
	void hjk() {
		System.out.println("this jaga ");
	}
	String hjl() {
		return "son";
	}
public	void sd() {
		
	}

public int xc() {
	return 7;
}
}
public class Buffer {
	 static int su(int...arr) {
			int result=0;
			for(int a:arr) {
				result+=a;
			}
			return result;
		}
	public Buffer(String f,int g){
	
		 super();
		 
	 }

	 
	public static void main(String[] args) throws IOException{
		 System.out.println(su(7,3,9,7));
		 Buffer kg=new Buffer("ddf",4);
		ram gf=new ram("n",9);
		  System.out.println(gf.f);
		  System.out.println(gf.g); 
		  gf.hjggk("this over", 1);
		  gf.hjggk("this over");
         
		  two fg=new two();
		  fg.hjk();
		  System.out.println(fg.hjl());
//BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		//FileReader read=new FileReader("file.txt");
		FileReader gh=new FileReader("File.txt");
		BufferedReader br=new BufferedReader(gh);
		  try {
			  
			  String line;
			  boolean isempty=true;
	        while((line=br.readLine())!=null) {
	        	System.out.println(line);
	        	isempty=false;
	        	}
	        	br.close();
	        	if(isempty)
	         {
	        	BufferedReader hj=new BufferedReader(new InputStreamReader(System.in));
	        	
	        	
	        		System.out.print("enter text : ");
	        	    line=hj.readLine();
	        	    
	        	  //  System.out.print("enter text : "+line);
	        	}
	     
	}
             catch (Exception e) {
//            	 System.err.println("this is not message"+e.getMessage());
            	 
             }
		  
             

	}

}
