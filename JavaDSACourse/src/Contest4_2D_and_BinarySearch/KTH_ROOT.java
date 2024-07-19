package Contest4_2D_and_BinarySearch;
import java.util.*;
public class KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		while(t-->0) {
		long n=sc.nextLong();
		long k=sc.nextLong();
		
		System.out.println(search(n,k));
		}

	}
	public static long search(long n,long k) {
		long lo=1;
		long hi=n;
		long ans=0;
		while(lo<=hi) {
			long mid=(lo+hi)/2;
			if(Math.pow(mid, k)<=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

}