package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String ans;
		int c=mazePath(1,1,"",n,m);
		System.out.println();
		System.out.print(c);

	}
	public static int  mazePath(int cr,int cc,String ans,int n,int m) {
		int count=0;
		if(cc==m && cr==n) {
			System.out.print(ans+" ");
			return 1;
		}
		if(cr>n || cc>m) {
			return 0;
		}
		 count+=mazePath(cr+1,cc,ans+"V",n,m);
		 count+=mazePath(cr,cc+1,ans+"H",n,m);
		
		 return count;
	}

}
