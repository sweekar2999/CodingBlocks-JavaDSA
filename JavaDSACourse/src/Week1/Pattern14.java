package Week1;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=5;
		int nst=1;
		int nsp=n-1;
		while(i<=(2*n-1)) {
			int csp=0;
			while(csp<nsp) {
				System.out.print(" ");
				csp++;
			} 
			int cst=0;
			while(cst<nst) {
				System.out.print("*");
				cst++;
			}
			System.out.println("");
			i++;
			if(i<=n) {
				nst++;
				nsp--;
			}
			else {
				nsp++;
				nst--;
			}
			
		}

	}

}
