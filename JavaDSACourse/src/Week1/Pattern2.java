package Week1;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int i=1,n=5;
		while(i<=n) {
			int j=0;
			while(j<=n-i) {
				System.out.print("*");
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}
	*/
	int i=1;
	int n=5;
	int nst=5;
	while(i<=n) {
		int cst=0;
		while(cst<nst) {
			System.out.print("*");
			cst++;
		}
		i++;
		System.out.println("");
		nst--;
	}
		
	}

}
