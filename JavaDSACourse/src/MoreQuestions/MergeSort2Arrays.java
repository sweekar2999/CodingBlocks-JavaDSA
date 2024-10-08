package MoreQuestions;

import java.util.Arrays;

public class MergeSort2Arrays {

    public static void main(String[] args) {
        // Example arrays
        int arr1[] = {2, 3, 1, 6, 7};
        int arr2[] = {6, 7, 2, 3, 4};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n = arr1.length + arr2.length;
        int arr[] = new int[n];
        int i=0;
        int j = 0, k = 0;
   while(i<arr1.length && j<arr2.length) {
	   if(arr1[i]>arr2[j]) {
		   arr[k]=arr2[j];
		  
		   j++;
		   
	   }
	   else {
		   arr[k]=arr1[i];

		   i++;
	   }
	   k++;
   }
	   while(i<arr1.length) {
		   arr[k]=arr1[i];
		   k++;
		   i++;
	   }
	   while(j<arr2.length) {
		   arr[k]=arr2[j];
		   k++;
		   j++;
		   
	   }
   
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
