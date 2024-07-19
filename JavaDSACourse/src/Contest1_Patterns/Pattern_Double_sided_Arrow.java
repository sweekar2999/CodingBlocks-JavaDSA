package Contest1_Patterns;

public class Pattern_Double_sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int nsp1=n-1;
		int nst1=1;
		int nst2=1;
		int nsp2=-1;
		int i=1;
		int val=1;
		while(i<=n) {
			int csp1=0;
			while(csp1<nsp1) {
				System.out.print(" ");
				csp1++;
			}
			int cst1=0;
			while(cst1<nst1) {
				if(i==1) {
					System.out.print("1");	
				} 
				else {
				System.out.print(val);
				val--;
				}
			
				cst1++;
			}
			int csp2=0;
			while(csp2<nsp2) {
				System.out.print(" ");
				csp2++;
			}
			int cst2=0;
			if(i==1 || i==n) {
				cst2=1;
			}
			
			while(cst2<nst2) {
				val++;
				
				System.out.print(val);
				
				cst2++;
			}
			System.out.println();
			i++;
			if(i<=((n+1)/2)) {
			nsp2+=2;
			nsp1-=2;
			nst1++;
			nst2++;
			val++;
			}
			else {
				nsp2-=2;
				nst1--;
				nst2--;
				nsp1+=2;
				val--;
			}
			
		}

	}

}
