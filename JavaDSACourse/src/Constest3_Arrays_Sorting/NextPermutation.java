package Constest3_Arrays_Sorting;
import java.util.*;
public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while ((t--) > 0) {

			int n = sc.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			next_permutation(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			
			System.out.println();
		}

	}
	public static void next_permutation(int []arr) {
//		   if (arr == null || arr.length < 2) return;
//		
//		int p=-1;
//		for(int i=arr.length-2;i>=0;i--) {
//			
//			if(arr[i]<arr[i+1]) {
//				p=i;
//				break;
//			}
//			
//		}
//		if (p ==-1) {
//            reverse(arr, 0, arr.length - 1);
//            return;
//        }
//		int q=-1;
//		for(int i=arr.length-1;i>p;i--) {
//			if(arr[i]>arr[p]) {
//				q=i;
//				break;
//			}
//		}
//		int temp=arr[p];
//		arr[p]=arr[q];
//		arr[q]=temp;
//		reverse(arr, p + 1, arr.length - 1);
//		
//		
		int ind=-1;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				ind=i;
				break;
			}
		}
		if(ind==-1) {
			reverse(arr,0,arr.length-1);
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>arr[ind]) {
				int temp=arr[ind];
				arr[ind]=arr[i];
				arr[i]=temp;
			}
		}
		reverse(arr,ind+1,arr.length-1);
	}
	public static void reverse(int []arr,int left,int right) {
		while(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		
	}

}
