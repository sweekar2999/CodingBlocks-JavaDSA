package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class SubsetProblemRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		int ans[]=new int[n];
		int sum=0;
		int c=Subset(arr,0,ans,0,target,0);
		System.out.println();
		System.out.print(c);

	}
	 public static int Subset(int arr[], int sum, int[] currentSubset, int subsetSize, int tar, int idx) {
	       int count =0;
	        if (sum == tar) {
	            for (int i = 0; i < subsetSize; i++) {
	                System.out.print(currentSubset[i] + " ");
	            }
	            System.out.print("  ");
	            return 1;
	        }
	        if (idx == arr.length) {
	            return 0;
	        }
	        for (int i = idx; i < arr.length; i++) {
	            currentSubset[subsetSize] = arr[i];
	           count+= Subset(arr, sum + arr[i], currentSubset, subsetSize + 1, tar, i + 1);
	        }
	        return count;
	    }

}
