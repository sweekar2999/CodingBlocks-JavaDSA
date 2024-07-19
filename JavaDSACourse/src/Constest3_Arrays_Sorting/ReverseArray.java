package Constest3_Arrays_Sorting;
import java.util.*;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	      
	       for(int i=0 ,j=arr.length-1;i<j;i++,j--) {
	    	   int temp=arr[i];
	    	   arr[i]=arr[j];
	    	   arr[j]=temp;
	       }
	       for(int i = 0; i < arr.length; i++) {
	           System.out.print(" "+arr[i]);
	       }

	}

}
