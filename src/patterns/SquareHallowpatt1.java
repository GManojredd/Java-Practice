package patterns;

public class SquareHallowpatt1 {
public static void pat(int k) {
//	int i,j;
//	for(i=0;i<n;i++) {
//		for(j=0;j<n;j++) {
//			
//			if(i==0||j==0||i==n-1||j==n-1
//					) {
//			System.out.print("*");}
//		
//		else {
//		System.out.print(" ");
//		
//	}
//	}
//		
//	System.out.println();	

int i,j;
for(i=0;i<k;i++){
for(j=0;j<k;j++){
if(i==0||j==0||i==k-1||j==k-1){
System.out.print("*");
}
else{
System.out.print(" ");
}}
System.out.println();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pat(4);

	}

}
