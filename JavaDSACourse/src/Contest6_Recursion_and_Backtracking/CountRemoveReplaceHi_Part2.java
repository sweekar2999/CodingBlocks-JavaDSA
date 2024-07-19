package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class CountRemoveReplaceHi_Part2 {

	   static int count = 0;

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        countHi(s);
	        
	        
	        System.out.println(count);

	        removehi(s, "");

	        replacehi(s, "");
	    }

	    public static void countHi(String ques) {
	        if (ques.length() < 2) {
	            return;
	        }

	        if (ques.substring(0, 2).equals("hi") && (ques.length() == 2 || ques.charAt(2) != 't')) {
	            count++;
	            countHi(ques.substring(2));
	        } else {
	            countHi(ques.substring(1));
	        }
	    }
	    public static void removehi(String ques, String ans) {
	        if (ques.length() == 0) {
	            System.out.println(ans);
	            return;
	        }

	        if (ques.length() > 1 && ques.substring(0, 2).equals("hi") && (ques.length() == 2 || ques.charAt(2) != 't')) {
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

	        if (ques.length() > 1 && ques.substring(0, 2).equals("hi") && (ques.length() == 2 || ques.charAt(2) != 't')) {
	            replacehi(ques.substring(2), ans + "bye");
	        } else {
	            replacehi(ques.substring(1), ans + ques.charAt(0));
	        }
	    }

}
