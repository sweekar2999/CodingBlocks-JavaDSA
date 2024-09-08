package Contest7_Stack_LL_and_Queue;

import java.util.Stack;

public class InsertAtBottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer>st =new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		System.out.println(st);
		InsertBottom(st,9);
		System.out.println(st);
		
	}
	public static void InsertBottom(Stack <Integer> st, int val) {
		if(st.empty()) {
			st.push(val);
			return;
		}
		int top=st.pop();
		InsertBottom(st,val);
		st.push(top);
	}

}
