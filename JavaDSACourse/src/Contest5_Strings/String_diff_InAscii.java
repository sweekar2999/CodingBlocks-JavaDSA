package Contest5_Strings;
import java.util.*;
public class String_diff_InAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		char ch1=s.charAt(0);
		for(int i=1;i<s.length();i++) {
			
			char ch2=s.charAt(i);
			int d=ch2-ch1;
			ans+=ch1+""+d;
			ch1=ch2;
			
		}
		ans+=ch1;
		System.out.println(ans);

	}

}
