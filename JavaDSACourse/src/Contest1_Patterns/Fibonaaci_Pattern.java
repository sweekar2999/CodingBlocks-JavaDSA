package Contest1_Patterns;

public class Fibonaaci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nst=1;
		int n=5;
		int i=1;
		int a=0,b=1,c;
		while(i<=n) {
		int cst=0;
		while(cst<nst) {
			if(i==1) {
System.out.print("0");
			}
			else {
          System.out.print(b);
          c=b;
          b=a+b;
          a=c;
			}
	      
			cst++;
		}
		System.out.println("");
		i++;
		nst++;
		}

	}

}
