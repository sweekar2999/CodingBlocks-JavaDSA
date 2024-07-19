package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class SubSequence {
static int count=0;
	  public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine();
	        subSeq(s,"");
	        System.out.println();
	        System.out.println(count);
	    }
	    public static void subSeq(String ques,String ans){
	        if(ques.length()==0){
	            System.out.print(ans+" ");
	            count++;
	            return;
	        }
	        char  ch=ques.charAt(0);
	        subSeq(ques.substring(1),ans+"");
	        subSeq(ques.substring(1),ans+ch);
	        
	    }

}
