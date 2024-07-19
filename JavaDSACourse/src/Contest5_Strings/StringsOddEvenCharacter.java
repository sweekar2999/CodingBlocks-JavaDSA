package Contest5_Strings;
import java.util.*;
public class StringsOddEvenCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(i%2==0) {
				ch++;
				ans=ans+ch;
			}
			else {
				ch--;
				ans=ans+ch;
			}
		}
		System.out.println(ans);

	}

}
