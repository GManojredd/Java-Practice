package oops;

class cap{
    public String name;
	public int acc_no;
	public String ifsc_code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	
}
public class Encapsulation1 {

	public static void main(String[] args) {
		cap sc=new cap();
	    sc.setAcc_no(43546567);
		sc.setIfsc_code("gh34h333333");
		sc. setName("manu");
		System.out.println(sc.getAcc_no()+" "+sc.getIfsc_code()+" "+sc. getName());
		// TODO Auto-generated method stub

	}

}
