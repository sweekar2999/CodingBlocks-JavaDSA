package Contest4_2D_and_BinarySearch;
import java.util.*;
public class BooleanMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int m = sc.nextInt();

		        int arr[][] = new int[n][m];
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                arr[i][j] = sc.nextInt();
		            }
		        }

		        int row = arr.length;
		        int col = arr[0].length;
		        int rarr[] = new int[row];
		        int carr[] = new int[col];

		        // Mark rows and columns that need to be set to 1
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                if (arr[i][j] == 1) {
		                    rarr[i] = 1;
		                    carr[j] = 1;
		                }
		            }
		        }

		        // Set rows and columns to 1 based on marked arrays
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < m; j++) {
		                if (rarr[i] == 1 || carr[j] == 1) {
		                    arr[i][j] = 1;
		                }
		            }
		        }

		        // Print the result
		        for (int i = 0; i < arr.length; i++) {
		            for (int j = 0; j < arr[i].length; j++) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		}

	
