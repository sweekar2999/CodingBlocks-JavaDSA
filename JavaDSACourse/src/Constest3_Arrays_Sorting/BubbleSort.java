package Constest3_Arrays_Sorting;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       for(int pass=1;pass<arr.length;pass++) {
	    	   for(int i=0;i<arr.length-pass;i++) {
	    		   if(arr[i]>arr[i+1]) {
	    			   int temp=arr[i];
	    			   arr[i]=arr[i+1];
	    			   arr[i+1]=temp;
	    		   }
	    	   }
	       }
	       for(int i = 0; i < arr.length; i++) {
	          System.out.print(arr[i]+" ");
	       }

	}

}
