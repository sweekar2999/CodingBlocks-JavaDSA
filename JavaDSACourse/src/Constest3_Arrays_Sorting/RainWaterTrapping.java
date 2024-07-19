package Constest3_Arrays_Sorting;
import java.util.*;
public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int times=sc.nextInt();
		for(int time=0;time<times;time++) {
	       int n=sc.nextInt();
	       int arr[]=new int[n];
	       int lm[]=new int[arr.length];
	       int rm[]=new int[arr.length];
	       for(int i = 0; i < arr.length; i++) {
	           arr[i] = sc.nextInt();
	       }
	       lm[0]=arr[0];
	       for(int i=1;i<arr.length;i++) {
	    	   lm[i]=Math.max(arr[i], lm[i-1]);
	       }
	       rm[arr.length-1]=arr[arr.length-1];
	       for(int i=arr.length-2;i>=0;i--) {
	    	   rm[i]=Math.max(arr[i], rm[i+1]);
	       }
	       int sum=0;
	       for(int i=0;i<arr.length;i++) {
	    	   sum=sum+Math.min(lm[i], rm[i])-arr[i];
	       }
	       System.out.println(sum);
		}
	       

	}

}
