package interfacee;

interface agagh{
	public void gbah();
	public int hjggj();
}
class pra {
	int gh;

	int hjggj(int k) {
		this.gh=k;
		return gh;
	}
public void gbah(){
		System.out.println("jvhdgrdg");
	}

}
class dfgh extends pra implements agagh{
public	void gbah(){
		System.out.println("jvhdgrdg");
	}

@Override
public int hjggj() {
	// TODO Auto-generated method stub
	return 8;
}	
}
public  class Interface0 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   dfgh bn=new dfgh();
   bn.gbah();
   System.out.println( bn.hjggj());
	}

}
