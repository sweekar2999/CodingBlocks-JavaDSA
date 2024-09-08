package Contest7_Stack_LL_and_Queue;
import java.util.*;
public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,6,3,7,5,77,8,9};
		Stack <Integer> st=new Stack<>();
		int ans[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.empty() && arr[i]>= arr[st.peek()]) {
				ans[st.pop()]=arr[i];
				
			}
			st.push(i);
		}
		while(!st.empty()) {
			ans[st.pop()]=-1;
		}
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" , ");
		}

	}

}
