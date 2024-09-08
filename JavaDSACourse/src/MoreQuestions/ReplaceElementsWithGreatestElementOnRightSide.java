package MoreQuestions;
import java.util.*;
public class ReplaceElementsWithGreatestElementOnRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, print the array.

Input Format
First line of input contains n number of elements in the array. Next line contains n elements of the array.

Constraints
1 <= arr.length <= 10^4
1 <= arr[i] <= 10^5

Output Format
An integer array representing greatest elements on their right.

Sample Input
5
17 18 5 4 6 1
Sample Output
18 6 6 6 1 -1
Explanation
index 0 --> the greatest element to the right of index 0 is index 1 (18).
index 1 --> the greatest element to the right of index 1 is index 4 (6).
index 2 --> the greatest element to the right of index 2 is index 4 (6).
index 3 --> the greatest element to the right of index 3 is index 4 (6).
index 4 --> the greatest element to the right of index 4 is index 5 (1).
index 5 --> there are no elements to the right of index 5, so we put -1.*/
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  for(int i=0;i<arr.length;i++){
		      arr[i]=sc.nextInt();
		  }
		  int max=-1;
		  for(int i=arr.length-1;i>=0;i--){
		      int current=arr[i];
		      arr[i]=max;
		      if(current>max){
		          max=current;
		      }
		  }
		  for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        
		    
		}
	}

}
