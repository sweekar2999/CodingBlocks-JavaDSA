package Week1;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n=5;
		int i=1;
		int nsp=n-1;
		int nst=1;
		while(i<=n) {
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
		nsp--;
		nst++;
        i++;
	}
	}

}
