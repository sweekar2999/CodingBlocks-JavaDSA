package Constest3_Arrays_Sorting;
import java.util.*;
public class VonNuemanLovesBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        
	        int N = sc.nextInt(); // Read the number of binary numbers
	        sc.nextLine(); // Consume the newline character after the integer input
	        
	        int[] decimalNumbers = new int[N]; // Create an array to store decimal numbers
	        
	        // Read each binary number, convert to decimal, and store in the decimalNumbers array
	        for (int i = 0; i < N; i++) {
	            String binaryStr = sc.nextLine(); // Read each binary number as a string
	            decimalNumbers[i] = Integer.parseInt(binaryStr, 2); // Convert binary to decimal and store
	        }
	        
	        // Print each decimal number
	        for (int i = 0; i < N; i++) {
	            System.out.println(decimalNumbers[i]);
	        }

	}

}
