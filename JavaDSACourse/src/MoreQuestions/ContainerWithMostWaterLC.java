package MoreQuestions;
import java.util.*;
public class ContainerWithMostWaterLC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=0;
		int l=0;
		int r=n-1;
		while(l<r) {
			int curr=Math.min(arr[l], arr[r])*(r-l);
			max=Math.max(max, curr);
			if(arr[l]<arr[r]) {
				l++;
			}
			else {
				r--;
			}
		}
		System.out.println(max);

	}

}
