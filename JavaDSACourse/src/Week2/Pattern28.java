package Week2;

public class Pattern28 {

	public static void main(String[] args) {

		int n = 5;
		int nst = 1;
		int nsp = n - 1;
		int row = 1;
//		int val =1;
		int val = 1;
		while (row <= n) {
		
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;

			while (cst < nst) {
	
				if (cst >= nst / 2) {
					System.out.print(val + " ");
					val--;
				}
				else {
					System.out.print(val + " ");
					val++;
				}
				cst++;
			}
			System.out.println();
			nsp--;
			nst += 2;
			val+=2;
			row++;
		}
		
		
	}

}
