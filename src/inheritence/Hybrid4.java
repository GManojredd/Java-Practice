package inheritence;

class vanu{
	int vb;
	int cvb;
	String s="jbjbj";
}
class raja extends vanu{
	private int h;

	
	int sdf(int k) {
		this.vb=k;
		return vb;
	}
}
class thir extends vanu{
	
}

class manu extends vanu{
	String er="gvv";
}
class mahu extends manu{
	String gf="mnvv";
}

public class Hybrid4 {

	public static void main(String[] args) {
		raja fd=new raja();
		System.out.println(fd.s);
		System.out.println(fd.sdf(7));

		thir as=new thir();
		System.out.println(as.s);
		mahu hg=new mahu();
		System.out.println(hg.gf);
		System.out.println(hg.er);
		System.out.println(hg.s);

		// TODO Auto-generated method stub

	}

}
