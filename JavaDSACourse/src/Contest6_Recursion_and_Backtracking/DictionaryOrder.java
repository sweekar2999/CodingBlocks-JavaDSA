package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class DictionaryOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char []c=sort(s);
		String s1=new String(c);
		lexoOrder(s1,"",s);

	}
	public static void lexoOrder(String ques,String ans,String org) {
		if(ques.length()==0) {
			if(ans.compareTo(org)>0) {
			System.out.println(ans);
			return ;
			}
		}
		for(int i=0;i<ques.length();i++) {
			char c1=ques.charAt(i);
			String rs=ques.substring(0,i)+ques.substring(i+1);
		
			lexoOrder(rs,ans+c1,org);
		}
	}
	public static char [] sort(String s) {
		char chars[]=s.toCharArray();
		for(int i=0;i<chars.length-1;i++) {
			for(int j=0;j<chars.length-i-1;j++) {
				if(chars[j]>chars[j+1]){
					char temp=chars[j];
					chars[j]=chars[j+1];
					chars[j+1]=temp;
				}
				
			}
		}
		return chars;
	}

}
