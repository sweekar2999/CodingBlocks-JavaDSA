package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class All_IndicesProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	        }
	        int m=sc.nextInt();
	        Sol(arr,m,0);
	    }
	    public static void Sol(int arr[],int tar, int idx){
	     if (idx > arr.length - 1) {
	            return;
	        }
	        if (arr[idx] == tar) {
	            System.out.print(idx + " ");
	        }
	        Sol(arr, tar, idx + 1);
	    }

}
