package inheritence;

class one{
	int tt;
	String q="jghf";
	void dflk() {
		System.out.println("kyjkhkh");
	}
}
class two extends one{
	String w="hfbnhg";
	int klr(int g) {
		this.tt=g;
		return tt;
	}
}
class three extends two{
	public three(int a) {
		System.out.println(a);
	}
}
public class multilevel2 {

	public static void main(String[] args) {
		three nb=new three(6);
		nb.dflk();
		System.out.println(nb.w);
		System.out.println(nb.q);
		System.out.println(nb.klr(9));
		
		// TODO Auto-generated method stub

	}

}
