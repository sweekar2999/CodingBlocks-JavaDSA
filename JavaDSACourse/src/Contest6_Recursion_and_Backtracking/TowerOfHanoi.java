package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		move(n,"A","B","C");

	}

	public static void move(int n, String src, String dest, String helper) {
		// TODO Auto-generated method stub
		if(n==0) {
			return ;
		}
		move(n-1,src,helper,dest);
		System.out.println("Moving ring " + n + " from " + src + " to " + dest);
		move(n-1,helper,dest,src);
		
	}

}
