package Week2;
import java.util.*;

public class Pattern20 {

	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
int n=7;
int mid=(n+1)/2;
int i=1;
while(i<=n) {
	int j=1;
	while(j<=n) {
		if(i+j==mid+1 || i-j==n/2|| j-i==n/2 ||  i+j==n+mid ) {
			System.out.print("* ");
		}
		else {
			System.out.print("  ");
		}
		j++;
	}
	i++;
	System.out.println("");
}*/     Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int row = 1;
int nst = n;
int nsp1 = n-1;
int nsp2=n-2;
while(row<=n) {
	int csp1=0;
	while(csp1<nsp1) {
		System.out.print(" ");
		csp1 = csp1 +1;
	}
	if(row==1 || row ==n) {
		int cst = 0;
		while(cst<nst) {
			System.out.print("*");
			cst = cst+1;
		}
	}
	else {
		System.out.print("*");
		int csp2 = 0;
		while(csp2<nsp2) {
			System.out.print(" ");
			csp2 = csp2 +1;
		}
		System.out.print("*");
	}
	System.out.println();
	row = row+1;
	nsp1--;
	
}
	    /*
        int n = 5;
        
        int row = 1;
        while (row <= n) {
            int spaces = 1;
            while (spaces <= n - row) {
                System.out.print(" ");
                spaces++;
            }
            
            int col = 1;
            while (col <= n) {
                if (row == 1 || row == n || col == 1 || col == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }*/
		
	}

}
