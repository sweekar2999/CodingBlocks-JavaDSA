package Week1;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
int n=5;
int nsp=n-1;
int nst=1;
int row=1;
while(row<=(2*n-1)) {
	int cst=0;
	while(cst<nst) {
		System.out.print("*");
		cst++;
	}
	int csp=0;
	while(csp<nsp) {
		System.out.print("");
		csp++;
	}
	
	System.out.println("");
	if(row>=n) {
		nsp++;
		nst--;
	}
	else {
		nsp--;
		nst++;
	}
	row++;
}*/
		
		
		int n=5;
		int nst=1;
		int nsp=n-1;
		int i=1;
		while(i<=(2*n-1)) {
			int cst=0;
			while(cst<nst) {
				System.out.print("*");
				cst++;
			}
			int csp=0;
			while(csp<nsp) {
				System.out.print(" ");
				csp++;
			}
			System.out.println("");
			if(i>=n) {
				nsp++;
				nst--;
			}
			else {
				nst++;
				nsp--;
			}
			i++;
		}
	}

}
