package Contest6_Recursion_and_Backtracking;

public class Replaceall0with5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int ans;
        ans=repplace(n);
        System.out.println(ans);
	}
	public static int repplace(int num) {
		if(num==0) {
			return 0;
		}
			int ld=num%10;
			if(ld==5) {
				ld=0;
			}
			int rm=repplace(num/10);
			return rm*10+ld;
	}

}
