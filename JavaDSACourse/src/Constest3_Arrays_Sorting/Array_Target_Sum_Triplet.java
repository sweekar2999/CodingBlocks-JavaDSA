package Constest3_Arrays_Sorting;
import java.util.*;
public class Array_Target_Sum_Triplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       int target=sc.nextInt();
	       Arrays.sort(arr); 
	       for(int i=0;i<arr.length-2;i++) {
	    	   for(int j=i+1;j<arr.length-1;j++) {
	    		   for(int k=j+1;k<arr.length;k++) {
	    			   if(target==(arr[i]+arr[j]+arr[k])) {
	    				   System.out.print(arr[i]+", "+arr[j]+" and "+arr[k]);
	    				   System.out.println();
	    			   }
	    			 
	    		   }
	    	   }
	    	   
	    	   
	       }

	}

}
