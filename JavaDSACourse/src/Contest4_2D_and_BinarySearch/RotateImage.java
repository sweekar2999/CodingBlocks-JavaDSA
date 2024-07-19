package Contest4_2D_and_BinarySearch;
import java.util.*;
public class RotateImage {

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
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	 for(int i=0;i<arr.length;i++) {
			int top=0,bottom=arr.length-1;
			while(top<bottom) {
				int temp=arr[top][i];
				arr[top][i]=arr[bottom][i];
				arr[bottom][i]=temp;
				top++;
				bottom--;
			}
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
