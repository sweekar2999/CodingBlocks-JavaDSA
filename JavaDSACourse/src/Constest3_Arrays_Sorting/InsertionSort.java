package Constest3_Arrays_Sorting;
import java.util.*;
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       for(int i=1;i<arr.length;i++) {
	    	   int item=arr[i];
	    	   int j=i-1;
	    	   while(j>=0 && arr[j]>item) {
	    		   arr[j+1]=arr[j];
	    		   j--;
	    	   }
	    	   j++;
	    	   arr[j]=item;
	       }
	       for(int i = 0; i < arr.length; i++) {
	           System.out.print(arr[i]+" ");
	       }

	}

}
