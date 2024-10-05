package Contest9_Heap_and_Hashmap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_Largest_Element_inArray {
	    public int findKthLargest(int[] nums, int k) {
	        PriorityQueue <Integer> pq=new PriorityQueue<>();
	        for(int i=0;i<nums.length;i++){
	            pq.offer(nums[i]);
	        }
	        for(int i=0;i<nums.length-k;i++){
	            pq.poll();
	        }
	        return pq.peek();

	    }
	    public void  helper() {
	    	Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int k=sc.nextInt();
			int ans=findKthLargest(arr,k);
			System.out.println(ans);
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Kth_Largest_Element_inArray obj=new Kth_Largest_Element_inArray();
             obj.helper();
	}

}
