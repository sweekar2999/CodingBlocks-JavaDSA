package Contest4_2D_and_BinarySearch;
import java.util.*;
public class ColumnWithMaximumSumMatrix {

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
		int maxsum=Integer.MIN_VALUE;
		int index=-1;
		for(int j=0;j<n;j++) {
			int sum=0;
			for(int i=0;i<n;i++) {
			sum+=arr[i][j];	
			}
			if(sum>maxsum) {
				maxsum=sum;
				index=j;
				
			}
		}
		System.out.println(index+" "+maxsum);
		
	}

}
