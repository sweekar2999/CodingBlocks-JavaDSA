package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class GenerateParenthesis {

	
		// TODO Auto-generated method stub
		   public static void main(String args[]) {
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        genParenthesis(n,0,0,"");
		    }
		    public static void genParenthesis(int n,int ob,int cb,String ans){
		        if(ob==n && cb==n){
		            System.out.println(ans);
		            return;
		        }
		        if(ob>n || cb>n){
		            return;
		        }
		         
		        if(ob>cb){
		            genParenthesis(n,ob,cb+1,ans+")");
		        
		    }
		        genParenthesis(n,ob+1,cb,ans+"(");

	}

}
