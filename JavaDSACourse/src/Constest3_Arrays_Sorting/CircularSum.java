package Constest3_Arrays_Sorting;
import java.util.*;
public class CircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
		System.out.println( maxsum(arr));
		}
	}
		public static int maxsum(int arr[]){
			int curmax=arr[0];
			int summax=arr[0];
			int curmin=arr[0];
			int summin=arr[0];
			int sum=arr[0];
			for(int i=1;i<arr.length;i++) {
				curmax=Math.max(arr[i],curmax+arr[i]);
				summax=Math.max(summax, curmax);
				curmin=Math.min(arr[i],curmin+arr[i]);
				summin=Math.min(summin, curmin);
				sum=sum+arr[i];
			}
			if(sum==summin) {
				return summax;
			}
			else {
				return (Math.max(summax,(sum-summin)));
			}
		
			
		}
		

	}


