package Constest3_Arrays_Sorting;
import java.util.*;
public class InverseOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }
       int b[]=new int[arr.length];
       for(int i=0;i<arr.length;i++) {
    	   int temp=arr[i];
    	   b[temp]=i;
    	  
       }
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(arr[i]+",");
       }
       System.out.println();
       for(int i=0;i<arr.length;i++) {
    	   System.out.print(b[i]+",");
       }
	}

}
