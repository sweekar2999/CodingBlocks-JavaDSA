package Contest4_2D_and_BinarySearch;
import java.util.*;
public class PiyushAndMagicalPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int m = scanner.nextInt();
	        int k = scanner.nextInt();
	        int s = scanner.nextInt();
	        
	        char[][] park = new char[n][m];
	        
	        // Read the park
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                park[i][j] = scanner.next().charAt(0);
	            }
	        }
	        int strength=s;
	        boolean canEscape = true;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	            	 if (strength <= k) {
		                    canEscape = false;
		                    break;
		                }
	                if (park[i][j] == '.') {
	                    strength -= 2;
	                } else if (park[i][j] == '*') {
	                    strength += 5;
	                } else if (park[i][j] == '#') {
	                    break;
	                }
	                if(j!=m-1) {
	                	strength--;
	                }
	               
	            }
	            if (!canEscape) {
	                break;
	            }
	        }
	        
	        // Print the result
	        if (canEscape) {
	            System.out.println("Yes");
	            System.out.println(strength);
	        } else {
	            System.out.println("No");
	        }
	}

}
