package Contest4_2D_and_BinarySearch;
import java.util.*;
public class ArraysSpiralPrintClockwise {

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
		SpiralPrint(arr);
	}
	public static void SpiralPrint(int [][]arr) {
		int count=0;
		int mincol=0;
		int minrow=0;
		int maxcol=arr[0].length-1;
		int maxrow=arr.length-1;
		int te=arr[0].length*arr.length;
		while(count<te) {
			for(int i=mincol;i<=maxcol && count<te;i++) {
				System.out.print(arr[minrow][i]+", ");
				
				count++;
			}
			minrow++;
			for(int i=minrow;i<=maxrow && count<te;i++) {
				System.out.print(arr[i][maxcol]+", ");
				
				count++;
			}
			maxcol--;
			for(int i=maxcol;i>=mincol && count<te;i--) {
				System.out.print(arr[maxrow][i]+", ");
				
				count++;
			}
			maxrow--;
			for(int i=maxrow;i>=minrow && count<te;i--) {
				System.out.print(arr[i][mincol]+", ");
				
				count++;
			}
			mincol++;
		}
		if(count==te) {
			System.out.print("END");
		}
	}

}
