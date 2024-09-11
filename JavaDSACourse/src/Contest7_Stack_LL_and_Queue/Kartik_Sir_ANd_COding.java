package Contest7_Stack_LL_and_Queue;
import java.util.*;
public class Kartik_Sir_ANd_COding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack <Integer> st=new Stack<>();
		int Q=sc.nextInt();
		for(int i=0;i<Q;i++) {
			int qtype=sc.nextInt();
			if(qtype==1) {
			    // Type-1: Student Query
                if (st.isEmpty()) {
                    System.out.println("No Code");
                } else {
                    // Pop and print the top module cost
                    System.out.println(st.pop());
                }
			}
			else if (qtype == 2) {
                // Type-2: Instructor Query
                int cost = sc.nextInt();
                // Push the new module with the given cost onto the stack
                st.push(cost);
            }

		}

	}

}
