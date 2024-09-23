package Week2;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int i=1;
		int n=5;
		int nst1=1;
		int nst2=1;
		int nsp=2*n-3;
		while(i<=n) {
			int cst1=0;
			if(i==n) {
				cst1=1;
			}
			while(cst1<nst1) {
				System.out.print("* ");
				cst1++;
			}
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2=0;
			while(cst2<nst2) {
				System.out.print("* ");
				cst2++;
			}
			System.out.println("");
			i++;
			nst1++;
			nst2++;
			nsp-=2;
			
			}
*/
		int i=1;
		int n=4;
		int nst1=1;
		int nst2=1;
		int nsp=2*n-3;
		while(i<=n) {
			int cst1=0;
			int val=1;
			int val1=1;
			if(i==n) {
				cst1=1;
			}
			while(cst1<nst1) {
				System.out.print(val+" ");
				cst1++;
				
			}
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2=0;
			while(cst2<nst2) {
			
				System.out.print(val+" ");
				cst2++;
			
				
			}
			System.out.println("");
			i++;
			nst1++;
			nst2++;
			nsp-=2;
		
		
			
			}

	}

}
