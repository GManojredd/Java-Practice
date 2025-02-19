package corejava;


class nurse{
	String name="vani";
	String Qualification="nursing";
	int age=26;
}
public class java {
	


	private static final char[] age = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nurse n1=new nurse();
		System.out.println(n1.age);
		System.out.println(n1.Qualification);
		System.out.println(n1.name);
//		int []ary= {1,2,3,4,5,6};
//		for(int i=0;i<ary.length;i++) {
//			System.out.println(ary[i]);
//			
//		}
		int []ary=new int[4];
		ary[0]=2;
		ary[1]=3;
		ary[2]=4;
		ary[3]=5;
		for(int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
			
		}

	
	
	}
}