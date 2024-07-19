package Constest3_Arrays_Sorting;
import java.util.*;
public class Arrays_MaxValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       int max=0;
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       for(int i=1;i<arr.length;i++) {
	    	   	   if(arr[i]>arr[max]) {
	    			   arr[max]=arr[i];
	    		   } 
	    	   
	       }
	       System.out.println(arr[max]);
	       
	       
		

	}

}
