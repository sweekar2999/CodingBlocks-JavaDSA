package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class ConversionFromStringToInt {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        conversion(s,0);
	    }
	    public static void conversion(String ques,int num){
	        if(ques.length()==0){
	          System.out.println(num);
	          return;
	        }
	                      char ch=ques.charAt(0);
	                       num=num*10+(ch-'0');
	                      conversion(ques.substring(1),num);
	    }

}
