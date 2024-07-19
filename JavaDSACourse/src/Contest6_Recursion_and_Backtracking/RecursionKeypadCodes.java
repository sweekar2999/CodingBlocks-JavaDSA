package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class RecursionKeypadCodes {

	  static String[] keypad = {"" , "abc", "def" ,"ghi" ,"jkl" , "mno" ,
				"pqrs" ,"tuv","wx" ,"yz"};
	    public static void main(String args[]) {
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        kp(s,"");
	    }
	    public static void kp(String ques,String ans){
	        if(ques.length()==0){
	            System.out.println(ans);
	            return;
	        }
	        char ch=ques.charAt(0);
	        String s=keypad[ch-'0'];
	        for(int i=0;i<s.length();i++){
	             kp(ques.substring(1),ans+s.charAt(i));
	        }
	    }

}
