package Contest1_Patterns;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=5;
		int nst1=1;
		int nst2=1;
		int nsp=2*n-3;
		while(i<=n) {
			int cst1=0;
			int val=1;
			
			
			while(cst1<nst1) {
				
				
				System.out.print(val+" ");

				val++;
				
				cst1++;
			}
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2=0;
			if(i==n) {
				cst2=1;
				val--;
			}
			while(cst2<nst2) {
			
				val--;	
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
