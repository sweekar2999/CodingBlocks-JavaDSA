package Contest7_Stack_LL_and_Queue;
import java.util.*;

public class Playing_With_Cards {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size");
        int n = sc.nextInt();
        
        System.out.println("Iterations");
        int q = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter card values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Generate the first q prime numbers
        List<Integer> primes = primes(q);
        
        // Call the Soln method with the array of cards and list of primes
        Soln(arr, primes);
    }

    public static void Soln(int[] arr, List<Integer> primes) {
        Stack<Integer> A0 = new Stack<>();
        Stack<Integer>[] B = new Stack[primes.size()]; 

        // Fill A0 stack
        for (int i = arr.length - 1; i >= 0; i--) {
            A0.push(arr[i]);
        }
        
        // Initialize B stacks
        for (int i = 0; i < primes.size(); i++) {
            B[i] = new Stack<>();
        }

        // Process iterations
        Stack<Integer> currentPile = A0;
        for (int i = 0; i < primes.size(); i++) {
            Stack<Integer> nextPile = new Stack<>();
            int prime = primes.get(i);

            while (!currentPile.isEmpty()) {
                int card = currentPile.pop();
                if (card % prime == 0) {
                    B[i].push(card);
                } else {
                    nextPile.push(card);
                }
            }
            currentPile = nextPile;
        }

        // The remaining pile is AQ
        Stack<Integer> AQ = currentPile;

        // Print results
        for (int i = 0; i < B.length; i++) {
            printStack(B[i]);
        }
        printStack(AQ);
    }

    private static void printStack(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }

    public static List<Integer> primes(int n) {
        List<Integer> primes = new ArrayList<>();
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                primes.add(num);
                count++;
            }
            num++;
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
