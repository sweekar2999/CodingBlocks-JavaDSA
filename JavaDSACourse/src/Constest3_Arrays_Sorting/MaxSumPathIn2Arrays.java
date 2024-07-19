package Constest3_Arrays_Sorting;
import java.util.*;
public class MaxSumPathIn2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[m];
			   for (int k = 0; k < n; k++) {
	                arr1[k] = sc.nextInt();
	            }
	            
	            // Read elements of the second array
	            for (int k = 0; k < m; k++) {
	                arr2[k] = sc.nextInt();
	            }
			int i=0,j=0,sumA=0,sumB=0,ans=0;
			while(i<n && j<m) {
                if (arr1[i] > arr2[j]) {
                    sumB += arr2[j];
                    j++;
                }

                else if (arr1[i] < arr2[j]) {
                    sumA += arr1[i];
                    i++;

				}
                else {
                    ans += Math.max(sumA, sumB);
                    sumA = 0;
                    sumB = 0;
                   
                    while (i < n && j < m && arr1[i] == arr2[j]) {
                        ans += arr1[i];
                        i++;
                        j++;
                    }
				}
			}
			   while (i < n) {
	                sumA += arr1[i];
	                i++;
	            }
	            
	            while (j < m) {
	                sumB += arr2[j];
	                j++;
	            }
	   
	            ans += Math.max(sumA, sumB);
	            
	            System.out.println(ans);
	            }

	}

}
/*
 * package Constest3;
import java.util.*;
public class MaxSumPathIn2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr1[]=new int[n];
			int arr2[]=new int[m];
			int i=0,j=0,sumA=0,sumB=0,ans=0;
			while(i<n && j<m) {
				if(arr1[i]>arr2[j]) {
					sumB=sumB+arr2[j];
					j++;
				}
				else if(arr1[i]<arr2[j]) {
					sumA=sumA+arr1[i];
					i++;
				}
				else {
					ans=ans+Math.max(sumA,sumB);
					sumA=0;
					sumB=0;
					while(arr1[i]==arr2[j] && i<n && j<m) {
						ans=ans+arr1[i];
						i++;
						j++;
					}
				}
				while(i<n) {
					sumA=sumA+arr1[i];
					i++;
				}
				while(j<m) {
					sumB=sumB+arr2[j];
					j++;
				}
			}
		ans=ans+Math.max(sumA, sumB);	
		System.out.println(ans);
		}

	}

}*/
