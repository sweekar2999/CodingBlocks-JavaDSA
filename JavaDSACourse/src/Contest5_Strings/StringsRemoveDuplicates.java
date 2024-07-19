package Contest5_Strings;
import java.util.*;
public class StringsRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		char curr=s.charAt(0);
		ans=ans+curr;
		int count=0;
		for(int i=1;i<s.length();i++) {
			char pres=s.charAt(i);
			if(curr==pres) {
				count++;
			}
			else {
				ans=ans+pres;
				curr=pres;
			}
		}
		System.out.println(ans);
		

	}

}
