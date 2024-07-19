package Contest1_Patterns;
import java.util.*;

public class Pattern_inverted_hourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int nst1=1;
		int nst2=1;
		int nsp=2*n -1;
		
		while(i<=2*n+1) {
			int val=5;
			int cst1=0;
			
			while(cst1<nst1) {
				if(i==1) {
					System.out.print(n);	
				}
				else {
				System.out.print(val+" ");
				val--;
				}
				cst1++;
			}
			int csp=0;
			while(csp<nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst2=0;
			if(i==n+1) {
				cst2=1;
				val++;
				
			}
			if(i>n+1) {
				nsp++;
			}
			while(cst2<nst2) {
				if(i==1) {
					System.out.print(" "+n);	
				}
				else {
					val++;
				System.out.print(val+" ");
				
				}
				cst2++;
			}
			System.out.println("");
			i++;
			
			if(i<=n) {
			nst1++;
			nst2++;
			nsp-=2;
			}
			else if(i==n+1) {
				nst1++;
				nst2++;
				nsp--;
			}
			else {
				nst1--;
				nst2--;
				nsp++;
			}
			}
			
			}
	}

