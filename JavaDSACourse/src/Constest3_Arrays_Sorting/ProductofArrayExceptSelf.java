package Constest3_Arrays_Sorting;
import java.util.*;
public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       int left[]=new int[arr.length];
	       int right[]=new int[arr.length];
	       int ans[]=new int[arr.length];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       left[0]=1;
	       for(int i=1;i<arr.length;i++) {
	    	   left[i]=left[i-1]*arr[i-1];
	       }
	       right[arr.length-1]=1;
	       for(int i=arr.length-2;i>=0;i--) {
	    	   right[i]=right[i+1]*arr[i+1];
	       }
	       for(int i=0;i<arr.length;i++) {
	    	   ans[i]=left[i]*right[i];
	    	   System.out.print(ans[i]+" ");
	       }

	}

}
