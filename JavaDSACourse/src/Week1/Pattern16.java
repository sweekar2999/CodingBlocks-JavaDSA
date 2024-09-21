package Week1;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
    int nsp=n-1;
    int nst=n;
    int i=1;
    while(i<=(2*n-1)) {
    	int csp=0;
    	while(csp<nsp) {
    		System.out.print(" ");
    		csp++;
    	}
    	int cst=0;
    	while(cst<nst) {
    		System.out.print("*");
    		cst++;
    	}
    	
    	if(i>=n) {
    		nst++;
    		nsp++;
   
    	}
    	else {
    		nst--;
    		nsp--;
    	}
    	System.out.println("");
    	i++;
    }
	}

}
