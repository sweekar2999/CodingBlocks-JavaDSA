package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class NthTriangleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Triangle(n));

	}
	public static int Triangle(int n) {
		if(n==1) {
			return 1;
		}
		return Triangle(n-1)+n;
		
	}

}
