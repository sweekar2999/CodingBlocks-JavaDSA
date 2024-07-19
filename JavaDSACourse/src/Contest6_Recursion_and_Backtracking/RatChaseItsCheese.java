package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class RatChaseItsCheese {

	
		// TODO Auto-generated method stub
	    static boolean flag = false;

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        char[][] board = new char[n][m];
	        for (int i = 0; i < n; i++) {
	            String s = sc.next();
	            for (int j = 0; j < m; j++) {
	                board[i][j] = s.charAt(j);
	            }
	        }
	        int[][] ans = new int[n][m];  
	        path(n, m, 0, 0, board, ans);
	        if (!flag) {
	            System.out.println( "NO PATH FOUND");
	        }
	    }

	    public static void path(int n, int m, int cr, int cc, char[][] board, int[][] ans) {
	      
	        if (cr == n - 1 && cc == m - 1 && board[cr][cc] != 'X') {
	            flag = true;
	            ans[cr][cc] = 1;
	            display(ans);
	            return;
	        }
	       
	        if (cr >= n || cc >= m || cr < 0 || cc < 0 || board[cr][cc] == 'X') {
	            return;
	        }
	        ans[cr][cc] = 1;
	        board[cr][cc] = 'X'; 
	        path(n, m, cr + 1, cc, board, ans); 
	        path(n, m, cr, cc + 1, board, ans); 
	        path(n, m, cr, cc - 1, board, ans); 
	        path(n, m, cr - 1, cc, board, ans); 
	        ans[cr][cc] = 0;
	        board[cr][cc] = '0';
	    }

	    public static void display(int arr[][]) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    

	}

}
