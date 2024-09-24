package Week2;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=5;
				int nst=1;;
	    int val=1;
		int nsp=n-1;
		while(i<=n) {
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=0;
			while(cst<nst) {
				if(cst==0 || cst==nst-1) {
				System.out.print(val+" ");
				cst++;
				}
				else {
					System.out.print("0"+" ");
					cst++;
				}
				
			
			}
			System.out.println("");
			i++;
			val++;
			nsp--;
			nst+=2;
		}
	}

}
