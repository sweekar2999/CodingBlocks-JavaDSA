package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class BostonNumber {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int originalN = n; // Store the original value of n for later use
		        
		        // Calculate the sum of the digits of n
		        int sumOfDigitsN = 0;
		        while (n > 0) {
		            sumOfDigitsN += n % 10;
		            n /= 10;
		        }
		        
		        n = originalN; // Restore the value of n for prime factorization
		        int sumOfDigitsPrimeFactors = 0;
		        
		        // Check for number of 2s that divide n
		        while (n % 2 == 0) {
		            sumOfDigitsPrimeFactors += 2;
		            n /= 2;
		        }
		        
		        // Check for other prime factors
		        for (int i = 3; i <= Math.sqrt(n); i += 2) {
		            while (n % i == 0) {
		                sumOfDigitsPrimeFactors += sumOfDigits(i);
		                n /= i;
		            }
		        }
		        
		        // This condition is to check if n is a prime number greater than 2
		        if (n > 2) {
		            sumOfDigitsPrimeFactors += sumOfDigits(n);
		        }
		        
		        // Check if the sum of the digits of the original number equals the sum of the digits of its prime factors
		        if (sumOfDigitsN == sumOfDigitsPrimeFactors) {
		            System.out.println(1);
		        } else {
		            System.out.println(0);
		        }
		    }
		    
		    // Function to calculate the sum of the digits of a number
		    public static int sumOfDigits(int num) {
		        int sum = 0;
		        while (num > 0) {
		            sum += num % 10;
		            num /= 10;
		        }
		        return sum;
		    }
		

	
}
