package practice;

class three{
	public int harry(){
	
return 8;
	}
	public int hg() {
		return 3;
	}
	}
 class five extends three{
		public int harry() {
			return 6;
		}
		public int hg() {
			return 4;
		}

	
}
public class Overriding {

	public static void main(String[] args) {
	three gh=new five();
	System.out.println(gh.harry());
	System.out.println(gh.hg());
	three gj=new three();
	System.out.println(gj.harry());
	System.out.println(gh.hg());
	}

}
