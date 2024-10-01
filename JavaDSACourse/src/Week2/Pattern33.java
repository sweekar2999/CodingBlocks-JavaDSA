package Week2;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nst=1;
		int i=1;
		int n=10;
	    int val=n;
		int nsp=n-1;
		while(i<=n) {
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=0;
			while (cst < nst) {
				
			/*	if (cst > nst / 2) {
					System.out.print(val + " ");
					val--;
				}
				else if(cst==nst/2) {
					System.out.print( "0 ");
					val--;
				}
				else {
					System.out.print(val + " ");
					val++;
				}
				*/
			
				//cst++;
				if(cst==nst/2) {
					System.out.print( "0 ");
					val--;
					
				}
				else if(cst<nst/2) {
				System.out.print(val + " ");
				val++;
				}
				else {
					System.out.print(val + " ");
					val--;
				}
				cst++;
				
			}
			System.out.println("");
			i++;
			
			nsp--;	
			nst+=2;
		}
	}

}
