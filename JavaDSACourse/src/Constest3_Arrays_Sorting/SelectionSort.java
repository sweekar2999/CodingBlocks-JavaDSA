package Constest3_Arrays_Sorting;
import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       for(int i=0;i<arr.length;i++) {
	    	   int min=i;
	    	   for(int j=i+1;j<arr.length;j++) {
	    		   if(arr[min]>arr[j]) {
	    			   min=j;
	    		   }
	    		   	    	   }
	    	   int temp=arr[i];
    		   arr[i]=arr[min];
    		   arr[min]=temp;

	       }
	       for(int i = 0; i < arr.length; i++) {
	           System.out.print(" "+arr[i]);
	       }

	}

}
