package Contest1_Patterns;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				// TODO Auto-generated method stub
				int n=3;
				int nst=1;
				int nsp=n-1;
				int i=1;
				int val=1;
				while(i<=(2*n)-1) {
					int csp=0;
					while(csp<nsp) {
						System.out.print("  ");
						csp++;
					}
					int cst=0;
					while(cst<nst) {
						System.out.print(val+" ");
						if(cst>=nst/2) {
						   val--;
						}
						else {
							val++;
						}
						cst++;
					}
						System.out.println("");
						if(i<n) {
							nst+=2;
							nsp--;
						}
						else {
							nst-=2;
							nsp++;
						}
					i++;
					val+=2;
					

			}

		}
}
		