package Contest7_Stack_LL_and_Queue;
import java.util.*;

public class Histogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Histogram h1 = new Histogram();
        
        System.out.println("Largest Rectangle Area: " + h1.largestRectangleArea(arr));
    }


    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        
        for (int i = 0; i < arr.length; i++) {
            
            while (!st.empty() && arr[i] <= arr[st.peek()]) {
                int h = arr[st.pop()];
                int w;
                if (st.empty()) {
                    w = i;
                } else {
                    w = i - st.peek() - 1;
                }
                ans = Math.max(ans, w * h);
            }
            st.push(i);
        }


        int i = arr.length;
        while (!st.empty()) {
            int h = arr[st.pop()];
            int w;
            if (st.empty()) {
                w = i;
            } else {
                w = i - st.peek() - 1;
            }
            ans = Math.max(ans, w * h);
        }

        return ans;
    }
}
