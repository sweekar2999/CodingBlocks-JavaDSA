package Contest4_2D_and_BinarySearch;
import java.util.*;
public class AggressiveCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cow=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(binarySearch(arr,cow));
		

	}
	public static int binarySearch( int arr[],int cow) {
		int lo=0;
		int hi=arr[arr.length-1]-arr[0];
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isPossible(mid ,cow,arr)) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}
	public static boolean isPossible(int mid, int cow,int arr[]) {
		int placed=1;
		int pos=arr[0];
		for(int i=1;i<arr.length;i++) {
			if((arr[i]-pos)>=mid) {
				placed++;
				pos=arr[i];
			}
			if(placed==cow) {
				return true;
			}
		}
		return false;
		
	}

}
