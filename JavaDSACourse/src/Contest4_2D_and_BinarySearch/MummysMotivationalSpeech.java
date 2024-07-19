package Contest4_2D_and_BinarySearch;
import java.util.*;
public class MummysMotivationalSpeech {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean isLowerTriangular=true;
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i][j] != 0) {
                    isLowerTriangular = false;
                    break;
                }
            }
            if (!isLowerTriangular) break;
        }

       
        if (isLowerTriangular) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


	}
	

}
