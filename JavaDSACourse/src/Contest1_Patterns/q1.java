package Contest1_Patterns;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int nst=1;
            int n=5;
            int nsp=n-1;
            int i=1;
            int value=1;
            while(i<=n) {
            	int cst=0;
            	int csp=0;
            	while(csp<nsp) {
            		System.out.print(" ");
            		csp++;
            	}
            	while(cst<nst) {
            	
            		if(cst>=(nst/2)) {
            			System.out.print(value);
            			value--;
            		}
            		else {
            			System.out.print(value);
            			value++;
            			
            		}
            		cst++;
            	}
            	System.out.println("");
            	i++;
            	value+=2;
            	nst+=2;
            	nsp--;
            	
            }
	}

}
