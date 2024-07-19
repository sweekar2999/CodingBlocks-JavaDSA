package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class Board_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=0;
        String ans;
        int c=boardPath(n,m,0,"");
         System.out.println(); 
         System.out.print(c);
    }
    public static int boardPath(int n,int m,int sum, String ans){
        int count=0;
        if(sum==n){
            System.out.print(ans+" ");
            return 1;
        }
        if(sum>n){
            return 0;
        }
        for(int i=1;i<=m;i++){
            count+=boardPath(n,m,sum+i,ans+i);
        }
        return count;
    }
}
