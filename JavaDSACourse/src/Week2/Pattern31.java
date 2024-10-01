package Week2;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=n;
		int i=1;
		
		while(i<=n) {
			int val=5;
			
			int cst=0;
			while(cst<nst) {
				if(cst==nst-i) {
					System.out.print("*");
					cst++;
					val--;
				}
				else {
				System.out.print(val+" ");
				cst++;
				val--;
				}
			}
			System.out.println(" ");
			i++;
		}

	}

}
