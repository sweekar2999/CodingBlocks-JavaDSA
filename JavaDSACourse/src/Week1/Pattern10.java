

package Week1;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	int n=5;
	int row =1;
	int nst = 2*n-1;
	int nsp = 0;
	while(row<= n) {
		int csp =0;
		while(csp < nsp) {
			System.out.print("  ");
			csp= csp+1;
		}
		int cst =0;
		while(cst<nst) {
			System.out.print("* ");
			cst = cst+1;
		}
		System.out.println();
		nst = nst -2;
		nsp = nsp +1;
		row =row +1;
 
	}
			}

		
}
