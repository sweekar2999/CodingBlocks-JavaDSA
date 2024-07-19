package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class Amonstrong_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter two numbers: ");
		        int num1 = scanner.nextInt();
		        int num2 = scanner.nextInt();
		        if (num1 > num2) {
		            int temp = num1;
		            num1 = num2;
		            num2 = temp;
		        }
		        for (int i = num1; i <= num2; i++) {
		            int num = i;
		            int sum = 0;
		            int temp = i;
		            int count = 0;
		            while (temp > 0) {
		                temp /= 10;
		                count++;
		            }
		            temp = i;
		            while (temp > 0) {
		                int digit = temp % 10;
		                sum += Math.pow(digit, count);
		                temp /= 10;
		            }
		            if (sum == i) {
		                System.out.print(i + " ");
		            }
		        }
		        System.out.println();
		    }
		}
		

	
