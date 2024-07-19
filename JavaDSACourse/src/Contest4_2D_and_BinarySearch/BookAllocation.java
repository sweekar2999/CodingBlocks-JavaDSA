package Contest4_2D_and_BinarySearch;
import java.util.*;
public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
		int n = sc.nextInt();
		int s = sc.nextInt();
		int books[] =  new int[n];
		for (int i = 0; i < books.length; i++) {
			books[i] = sc.nextInt();
		}
		System.out.println(binarysearch(books, n, s));
	}
	}
	public static int binarysearch(int books[], int n,int s) {
		int lo = 0;
		int hi = 0;
		int ans =0;
		for (int i = 0; i < books.length; i++) {
			hi+= books[i];
		}
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isPossible(mid,s,books)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
	return ans;
	}
	public static boolean isPossible(int mid,int s, int books[] ) {
		int nos=1;
		int pages=0;
		for(int i=0;i<books.length;) {
			if(books[i]+pages<=mid) {
				pages=pages+books[i];
			i++;
			}
			else {
				nos++;
				pages=0;
			}
			if(nos>s) {
				return false;
			}
		}
		
		return true;
	}

}
