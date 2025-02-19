package interfacee;

interface magii{
	public void gane();
	public String ganii(); 
}
interface food extends magii{
	public int gutt();
}
class  intlo implements food{
public void gane() {
	System.out.println("hgc");
}
public String ganii() {
	return "manu g redi";
}
public int gutt() {
	return 7;
}
}
class bita extends intlo{
	int l;
	String m; 
	static void kaa(int k) {
		System.out.println(k);
	}
	static void kaa(int k,String u) {
		
		System.out.printf("this is %d and %s",k,u);

	}}

public class interface1  {

	public static void main(String[] args) {
		bita hg=new bita();
		hg.gane();
		System.out.println(hg.ganii());
		
		System.out.println(hg.gutt());

		bita.kaa(8,"gffyjh");
		// TODO Auto-generated method stub

	}

}
