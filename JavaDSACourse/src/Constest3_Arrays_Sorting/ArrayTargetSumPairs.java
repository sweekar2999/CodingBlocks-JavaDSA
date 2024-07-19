package Constest3_Arrays_Sorting;

import java.util.*;

public class ArrayTargetSumPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int target = sc.nextInt();
	        
	        Arrays.sort(arr); 
	        
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (target == (arr[i] + arr[j])) {
	                    if (arr[i] < arr[j]) {
	                        System.out.println(arr[i] + " and " + arr[j]);
	                    } else {
	                        System.out.println(arr[j] + " and " + arr[i]);
	                    }
	                }
	            }
	        }
	}

}
