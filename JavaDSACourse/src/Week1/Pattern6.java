package Week1;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nsp=0;
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
				System.out.print("*");
				cst++;
			}
			i++;
			System.out.println("");
			nsp+=2;
			nst--;
		}

	}

}
