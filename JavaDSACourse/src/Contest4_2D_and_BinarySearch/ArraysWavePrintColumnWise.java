package Contest4_2D_and_BinarySearch;
import java.util.*;
public class ArraysWavePrintColumnWise {


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
   WavePrint(arr);
	}
	public static void WavePrint(int [][]arr) {
		int count=0;
		for(int j=0;j<arr[0].length;j++) {
			if(j%2==0) {
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i][j]+",");
					count++;
				}
			}
			else {
				for(int i=arr.length-1;i>=0;i--) {
					System.out.print(arr[i][j]+",");
					count++;
				}
			}
		}
		if(count==(arr.length*arr[0].length)) {
			System.out.print("END");
		}
	}

}
