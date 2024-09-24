package Week2;

public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=5;
		int nst1=n;
		int nst2=n;
		int nsp=-1;
		while(i<=n) {
			int cst1=0;
			if(i==1) {
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
			nst1--;
			nst2--;
			nsp+=2;
			
			}
	}

}
