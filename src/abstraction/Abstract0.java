package abstraction;

interface zero{
	public String hun();
	public  String thou();
}
abstract class one{
	
	public one(String m,int l) {
		
	}
	void raj() {
		System.out.println("my");
	}
	abstract void jar();
	abstract String mal();
}
abstract class two extends one {
    
	public two(String m,int l) {
		super(m,l);
		// TODO Auto-generated constructor stub
	}
	void jar() {
		System.out.println("self");
	}
	String mal() {
		return "manu" ;
	}
	abstract int cat();
}
 class three extends two implements zero{
	 String jk;
	 int hj;
	 int jl;
	 public three(String m,int l,int k) {
		super(m,l);
		this.jk=m;
		this.hj=l;
		this.jl=k;
		// TODO Auto-generated constructor stub
	}
	 
	 
	 public String getjk() {
		return jk;
	}
	 public int gethj() {
		 return hj;
	 }


	public int getjl() {
		return jl;
	}


	public String hun() {
		 return "redy";
	 }
	 public String thou() {
		 return "cs";
	 }

	int cat() {
		 return 9;
	 }
 }
 
 

public abstract class Abstract0 {
	public static void main(String[]args) {
		three df=new three("dsffrfd",8,9);
		System.out.println(df.getjk());
		System.out.println(df.gethj());
		System.out.println(df.getjl());
		df.raj();
		df.jar();
	System.out.println(df.mal());
	System.out.println(df.hun());
	System.out.println(df.thou());
	System.out.println(df.cat());
	
	
	}
	
}