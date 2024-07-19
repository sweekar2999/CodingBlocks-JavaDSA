package Contest5_Strings;
import java.util.*;
public class palinfrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
   
     String s=sc.nextLine();
   
    int i=0;
    int j=s.length()-1;
System.out.println(isPalindrome(s,i,j));
	}

	public static boolean isPalindrome(String s, int i, int j) {
		// TODO Auto-generated method stub
	    while(i<=j) {
	    	if(s.charAt(i)==s.charAt(j)) {
	    		i++;
	    		j--;
	    	}
	    	
	    	else {
	    		return false;
	    	}
	    }

		return true;
	}

}
