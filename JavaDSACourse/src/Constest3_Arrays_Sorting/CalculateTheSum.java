package Constest3_Arrays_Sorting;
import java.util.*;
public class CalculateTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc=new Scanner(System.in);
		int MOD=1000000007;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int o=sc.nextInt();
		for(int i=0;i<o;i++) {
			int x=sc.nextInt();
			int newArray[]=new int[n];
			for(int j=0;j<arr.length;j++) {
				newArray[j]=(arr[j]+arr[(j-x+n)%n])%MOD;
			}
			arr=newArray;
		}
		  long sum = 0;
	       for (int i = 0; i < arr.length; i++) {
	    sum = (sum + arr[i]) % MOD;
	}
	        System.out.println(sum);
	        */
		Scanner sc=new Scanner(System.in);
		final int MOD=1000000007;
		int size=sc.nextInt();
		long arr[]=new long[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextLong();
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++) {
			int X=sc.nextInt();
			long newA[]=new long[size];
			for(int j=0;j<size;j++) {
				newA[j]=(arr[j]+arr[(j-X+size)%size])%MOD;
				
			}
			arr=newA;
		}
		long sum=0;
		for(int i=0;i<size;i++) {
			sum=(sum+arr[i])%MOD;
		}
		
		   System.out.println(sum);

	}

}
