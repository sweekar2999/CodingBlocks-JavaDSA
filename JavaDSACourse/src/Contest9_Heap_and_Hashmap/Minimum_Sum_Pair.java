
package Contest9_Heap_and_Hashmap;

import java.util.PriorityQueue;

public class Minimum_Sum_Pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			pq.offer(arr[i]);
		}
		int sum=0;
		while(pq.size()>1) {
			int a=pq.poll();
			int b=pq.poll();
			sum=sum+(a+b);
			pq.offer((a+b));
		}
		System.out.println(sum);

	}

}
/*

Problem Statement:
You are given an array of integers. The task is to combine the elements in pairs such that the sum of pairwise combinations is minimized. After combining two elements, their sum is added back to the list, and this process is repeated until only one element remains. You need to return the total sum of all pairwise combinations.

Explanation:
Input: An array of integers.
Procedure:
Pick the two smallest elements, combine them, and add their sum back to the list.
Repeat this process until only one element remains in the list.
The total sum of all combinations should be returned.
Objective: Minimize the total sum of the combinations.
Example 1:
Input:
arr = [1, 2, 3, 4]

Steps:

Combine 1 and 2 → Sum = 1 + 2 = 3, Add 3 back to the list → List becomes [3, 3, 4].
Combine 3 and 3 → Sum = 3 + 3 = 6, Add 6 back to the list → List becomes [6, 4].
Combine 4 and 6 → Sum = 4 + 6 = 10, Add 10 back to the list → List becomes [10].
The total sum = 3 + 6 + 10 = 19.

Output: 19

Example 2:
Input:
arr = [100, 1, 3, 9, 6, 7, 14, 10]

Steps:

Combine the smallest two numbers (1 and 3), add their sum back.
Continue until only one element remains.
The goal is to minimize the total sum by always combining the two smallest numbers at each step.*/

