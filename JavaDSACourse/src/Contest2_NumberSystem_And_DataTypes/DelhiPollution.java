package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class DelhiPollution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt(); 
        for (int i = 0; i < N; i++) {
            int carNumber = sc.nextInt();
            
            int sumEven = 0;
            int sumOdd = 0;
            
            int temp = carNumber;
            
            while (temp > 0) {
                int digit = temp % 10;
                temp /= 10;
                
                if (digit % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
            }
        
            if (sumEven % 4 == 0 || sumOdd % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

	}

}
