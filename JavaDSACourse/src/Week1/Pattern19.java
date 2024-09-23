package Week1;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// TODO Auto-generated method stub
int n=5;
int nst = n;
int nst2 = n;
int nsp = -1;
int row = 1;
while (row <= (2*n-1)) {
	int cst = 0;
	if(row==1|| row==(2*n-1)) {
		cst =1;
	}
	while (cst < nst) {
		System.out.print("*");
		cst++;
	}
	int csp = 0;
	while (csp < nsp) {
		System.out.print(" ");
		csp++;
	}
	int cst2 = 0;
	while (cst2 < nst2) {
		System.out.print("*");
		cst2++;
	}
	System.out.println();
	if (row >= n) {
		nsp -= 2;
		nst2++;
		nst++;
	} else {
		nsp += 2;
		nst2--;
		nst--;

	}
	row++;

}
	}

}
