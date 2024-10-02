package MoreQuestions;
import java.util.*;
public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		k=k%n;
		reverse(0,n-1,arr);
		reverse(0,k-1,arr);
		reverse(k,n-1,arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void reverse(int i,int j,int arr[]) {
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
/*
 * class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[(n - k + i) % n];
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }
}

 */
