package Week2;

public class Pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1;
int n=5;
int nst=1;;
int val=1;
int nsp=n-1;
while(i<=n) {
int csp=0;
while(csp<nsp) {
System.out.print("  ");
csp++;
}
int cst=0;
while (cst < nst) {
System.out.print(val + " ");
if (cst >= nst / 2) {
	val--;
}
else {
	val++;
}
cst++;
}
System.out.println("");
i++;
val++;
nsp--;
nst+=2;
}
	}

}
