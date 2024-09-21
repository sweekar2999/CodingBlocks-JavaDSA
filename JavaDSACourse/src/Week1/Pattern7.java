package Week1;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		while(i<=n) {
			int j=1;
		while(j<=n) {
			if(i==1|| i==n ||j==1|| j==n) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			j++;
		}
		i++;
		
		
		System.out.println("");
		/*
		 * 	int n=5;
		int row = 1;
		int nst = n;
		int nsp = n-2;
		while(row<=n) {
			if(row==1 || row ==n) {
				int cst = 0;
				while(cst<nst) {
					System.out.print("* ");
					cst = cst+1;
				}
			}
			else {
				System.out.print("* ");
				int csp = 0;
				while(csp<nsp) {
					System.out.print("  ");
					csp = csp +1;
				}
				System.out.print("* ");
			}
			System.out.println();
			row = row+1;
			
		}*/
			
		}

	}

}
