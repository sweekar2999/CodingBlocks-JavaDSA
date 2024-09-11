package Contest7_Stack_LL_and_Queue;

import java.util.*;

public class Find_the_Greater_Element {

    public static void main(String[] args) {
        int arr[] = {5, 3, 8, -2, 7};
        Stack<Integer> st = new Stack<>();
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);
        
        for (int i = 0; i < 2 * arr.length; i++) {
            int index = i % arr.length;
     
            while (!st.empty() && arr[index] > arr[st.peek()]) {
                result[st.pop()] = arr[index];
            }
            
            if (i < arr.length) {
                st.push(index);
            }
        }
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
