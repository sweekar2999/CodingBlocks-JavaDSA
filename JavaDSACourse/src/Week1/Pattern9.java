package Week1;

public class Pattern9 {
	public static void main(String[] args) {
		

	
		int n = 5;
        int nst = 1;
        int nsp = n-1;
        int i = 1;
        
        while (i <= n) {
            int csp = 0;
            while (csp < nsp) {
                System.out.print(" ");
                csp++;
            }
            
            int cst = 0;
            while (cst < nst) {
                System.out.print("*");
                cst++;
            }

            // Move to the next line
            System.out.println();

            // Increment nst for the next row
            nst += 2;
            
            // Decrement nsp for the next row
            nsp--;
            
            // Increment i for the next row
            i++;
        }	

				
	
	}}

