package Contest5_Strings;
import java.util.*;
public class PalindromicSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=1;i<=s.length();i++) {
			for(int j=0;j<=s.length()-i;j++) {
				if(isPalindrome(s.substring(j,j+i))) {
					count++;
				}
			}
		}
		System.out.println(count);

	}
	public static boolean isPalindrome(String s) {
	int i=0;
	int j=s.length()-1;
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
