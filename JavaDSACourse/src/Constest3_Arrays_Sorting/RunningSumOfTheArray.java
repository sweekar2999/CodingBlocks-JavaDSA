package Constest3_Arrays_Sorting;
import java.util.*;
public class RunningSumOfTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       int sum=0;
	       for(int i=0;i<arr.length;i++) {
	    	   sum=sum+arr[i];
	    	   arr[i]=sum;
	    	   System.out.print(arr[i]+" ");
	       }
	}

}
