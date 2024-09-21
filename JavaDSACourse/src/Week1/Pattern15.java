package Week1;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=5;
int nst=n;
int nsp=0;
int i=1;
while(i<=(2*n-1)) {
	int csp=0;
	while(csp<nsp) {
		System.out.print("  ");
		csp++;
	}
	int cst=0;
	while(cst<nst) {
		System.out.print("* ");
		cst++;
	}
	System.out.println("");
	if(i>=n) {
	nst++;
	nsp-=2;
	
}
	else {
		nsp+=2;
		nst--;
	}
	i++;
	}

	}}
