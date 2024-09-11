//package Contest7_Stack_LL_and_Queue;
//import java.util.*;
//public class Form_Smallest_From_DI_Sequence {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s="IDDDIDD";
//		int ans[]=new int[s.length()+1];
//		Stack <Integer> st=new Stack<>();
//		int c=1;
//		for(int i=0;i<=s.length();i++) {
//			if (s.charAt(i)=='I') {	
//				ans[i]=c++;
//				while(!st.empty()) {
//					ans[st.pop()]=c++;
//				}
//				
//				}
//			else {
//				st.push(i);
//			}
//			}
//			
//
//	}
//
//}
package Contest7_Stack_LL_and_Queue;
import java.util.*;

public class Form_Smallest_From_DI_Sequence {

    public static void main(String[] args) {
        String s = "IDDDIDD";
        int ans[] = new int[s.length() + 1];  // Array to store the smallest number sequence
        Stack<Integer> st = new Stack<>();    // Stack to track positions of 'D'
        int c = 1;  // Start with the smallest number
        
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == 'I') { // If 'I' or end of string
                ans[i] = c++;  // Assign the current number to this position
                while (!st.empty()) {
                    ans[st.pop()] = c++;  // Pop from stack and assign the next number
                }
            } else {
                st.push(i);  // If 'D', push index onto the stack
            }
        }
        
        // Print the output
        System.out.print("Smallest number formed: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
