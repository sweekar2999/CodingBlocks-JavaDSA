package Contest7_Stack_LL_and_Queue;
import java.util.*;
public class Celeb_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of players");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        System.out.println(Soln(arr));
		

	}
	public static int Soln(int arr[][]) {
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			st.push(i);
			}
		while(st.size()>1) {
		int a=st.pop();
		int b=st.pop();
		if(arr[a][b]==1) {
			st.push(b);
		}
		else {
			st.push(a);
		}
		}
		int celeb=st.pop();
		for(int i=0;i<arr.length;i++) {
			if(i==celeb) {
				continue;
			}
			if(arr[i][celeb]==0 || arr[celeb][i]==1) {
				return -1;
			}
		}
		return celeb;
	}

}
