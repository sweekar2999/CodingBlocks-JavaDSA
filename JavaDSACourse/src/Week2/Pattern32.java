package Week2;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=1;
		int nsp=n-1;
		int i=1;
		int val=1;
		while(i<=(2*n-1)) {
			int cst=0;
			while(cst<nst) {
				if(cst%2==0) {
				System.out.print(val);
				cst++;
				}
				else {
					System.out.print("*");
					cst++;
				}
			}
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			System.out.println();
			if(i<n) {
				nst+=2;
				val++;
				nsp-=2;
			}
			else {
				nst-=2;
				nsp+=2;
				val--;
			}
			i++;
			
		}

	}

}
