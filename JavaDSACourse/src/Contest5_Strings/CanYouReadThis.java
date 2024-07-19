package Contest5_Strings;
import java.util.*;
public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String inputS=sc.nextLine();
       camelcase(inputS);
	}
	public static void camelcase(String s) {
		String ans="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch) && i!=0) {
				System.out.println(ans);
				ans="";
			}
			ans=ans+ch;
		}
		   if (!ans.isEmpty()) {
	            System.out.println(ans);
	        }
	}

}
