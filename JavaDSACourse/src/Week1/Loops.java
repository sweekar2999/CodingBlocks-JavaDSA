package Week1;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=4;
        int val=1;
	    int nst=1;
        int nsp=n-1;
        while(i<=n){
            int cst=0;
            while(cst<nst){
                System.out.print("* ");
              
                cst++;
            }
         
            System.out.println();
            i++;
            nst++;
            
        }

	}

}
