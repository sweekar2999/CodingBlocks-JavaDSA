package Contest1_Patterns;

public class Pattern_With_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nst=1;
		int n=5;
		int i=1;
		while(i<=n) {
		int cst=0;
		while(cst<nst) {
	        if(nst>=n-2) {
	        	if(cst==0 || cst==nst-1) {
	        		System.out.print(i);
	        	}
	        	else {
	        		System.out.print("0");
	        	}
	        	 
	        }
	        else {
			System.out.print(i);
	        }
			cst++;
		}
		System.out.println("");
		i++;
		nst++;
		}

	}

}
