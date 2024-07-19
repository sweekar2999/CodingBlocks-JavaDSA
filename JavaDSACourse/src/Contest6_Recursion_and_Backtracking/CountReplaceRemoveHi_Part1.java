package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class CountReplaceRemoveHi_Part1 {
	static int count = 0;
	
	    

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	         counthi(s);
	        System.out.println(count);
	        removehi(s, "");
	        
	        replacehi(s, "");
	        
	       
	    }

	    public static void removehi(String ques, String ans) {
	        if (ques.length() == 0) {
	            System.out.println(ans);
	            return;
	        }

	        if (ques.length() > 1 && ques.substring(0, 2).equals("hi")) {
	            removehi(ques.substring(2), ans);
	        } else {
	            removehi(ques.substring(1), ans + ques.charAt(0));
	        }
	    }

	    public static void replacehi(String ques, String ans) {
	        if (ques.length() == 0) {
	            System.out.println(ans);
	            return;
	        }

	        if (ques.length() > 1 && ques.substring(0, 2).equals("hi")) {
	           
	            replacehi(ques.substring(2), ans + "bye");
	        } else {
	            replacehi(ques.substring(1), ans + ques.charAt(0));
	        }
	    }
	    public static void counthi(String ques){
	   if (ques.length() <1) {
	           
	            return;
	        }

	        if (ques.length() > 1 && ques.substring(0, 2).equals("hi")) {
	           count++;
	            counthi(ques.substring(2));
	        } else {
	            counthi(ques.substring(1));
	        }
	    }

	}

