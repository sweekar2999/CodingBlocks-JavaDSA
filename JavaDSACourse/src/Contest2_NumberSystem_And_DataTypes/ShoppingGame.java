package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class ShoppingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        int T = sc.nextInt(); // Number of test cases
		        
		        for (int t = 0; t < T; t++) {
		            int M = sc.nextInt(); // Maximum smartphones Aayush can purchase
		            int N = sc.nextInt(); // Maximum smartphones Harshit can purchase
		            
		            int aayushPurchase = 0;
		            int harshitPurchase = 0;
		            int turn = 1; // Turn counter, starts with Aayush purchasing 1 smartphone
		            
		            while (true) {
		                if (turn % 2 != 0) { // Aayush's turn
		                    aayushPurchase += turn;
		                    if (aayushPurchase > M) {
		                        System.out.println("Harshit");
		                        break;
		                    }
		                } else { // Harshit's turn
		                    harshitPurchase += turn;
		                    if (harshitPurchase > N) {
		                        System.out.println("Aayush");
		                        break;
		                    }
		                }
		                turn++;
		            }
		        }
		        
		   


	}

}
