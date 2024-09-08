package Contest7_Stack_LL_and_Queue;
import java.util.*;
public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
			for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			Soln(arr);

	}
	public static void Soln(int arr[]) {
		Stack<Integer> st=new Stack<>();
		int ans[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.empty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			if(st.empty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
						
			}
			st.push(i);
		}
		display(ans);
	}
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
