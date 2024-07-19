package Contest4_2D_and_BinarySearch;
import java.util.*;
public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int target=sc.nextInt();
		System.out.print(Search(arr,target));
	}
	public static int Search(int arr[][],int target) {
		int row=0;
		int col=arr[0].length-1;
		while(col>=0 && row<arr.length) {
			if(arr[row][col]==target) {
				return 1;
			}
			if(arr[row][col]<target) {
				row++;
			}
			else {
				col--;
			}
		}
		return 0;
	}

}
