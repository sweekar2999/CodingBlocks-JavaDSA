package Contest1_Patterns;

public class HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=n-1;
		int nsp1=n-1;
		int i=1;
		int nst=n;
		while(i<=n) {
			int csp=0;
			while(csp<nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=0;
			while(cst<nst) {
				if(i==1 || i==n) {
					System.out.print("*");
				}
				else {
					System.out.print("*");
					int csp1=0;
					while(csp1<nsp1) {
						System.out.print(" ");
						csp1++;
					}
					System.out.print("*");
				}
			}
				System.out.println("");
			csp--;
			i++;
		}

	}

}
