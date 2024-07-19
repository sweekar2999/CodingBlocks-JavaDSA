package Contest4_2D_and_BinarySearch;
import java.util.*;
public class PrintUpperTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<=j) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
