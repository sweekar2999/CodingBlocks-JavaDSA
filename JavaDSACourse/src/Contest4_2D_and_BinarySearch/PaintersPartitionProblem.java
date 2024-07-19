package Contest4_2D_and_BinarySearch;
import java.util.*;
public class PaintersPartitionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(binarySearch(arr,k));

	}
	public static int binarySearch(int arr[],int k) {
	int lo=0;
	int hi=0;
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		hi=arr[i]+hi;
	}
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(isPossible(mid,k,arr)) {
			ans=mid;
			hi=mid-1;
		}
		else {
			lo=mid+1;
		}
	}
	return ans;
	}
	public static boolean isPossible(int mid,int k, int arr[] ) {
	int painter=1;
	int ppc=0;
	for(int i=0;i<arr.length;) {
		if(ppc+arr[i]<=mid) {
			ppc=ppc+arr[i];
			i++;
		}
		else {
			painter++;
			ppc=0;
		}
		if(painter>k) {
			return false;
		}
	}
	
	return true;
	}

}
