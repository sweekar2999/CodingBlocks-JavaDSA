package Constest3_Arrays_Sorting;
import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	     
	      int a=-1;;
	       int arr[]=new int[n];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	      
	       for(int i=0;i<arr.length;i++) {
	    	   int count=0;
	    	   for(int j=0;j<arr.length;j++) {
	    		   if(arr[i]==arr[j]) {
	    			   count++;
	    		   }
	    		 
	    	   }
	    	   if(count>arr.length/2) {
    			   a=arr[i];
    		   }
	       }
	     
	    	   System.out.println(a);
	       

	}

}
