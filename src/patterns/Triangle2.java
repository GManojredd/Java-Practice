package patterns;


public class Triangle2 {
public static void tri(int n) {
                int i,j;
                for(i=1;i<=n;i++) {
                	for(j=1;j<=n-i;j++) {
                		System.out.print("0 ");
                	}
                	for(j=1;j<=i;j++) {
                		System.out.print(i+"   ");
                	}
                	 System.out.println();
                	 
                }
                

                
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
tri(3);
	}

}
