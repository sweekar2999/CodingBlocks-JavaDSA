package Contest5_Strings;
import java.util.*;
public class PlayingWithGoodString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int ans=0;
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(isVowel(s.charAt(i))) {
				count++;
			}
			else {
				ans=Math.max(count,ans);
				count=0;
			}
		}
		System.out.println(ans);

	}
	public static boolean isVowel(char c) {
		if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
			return true;
		}
		return false;
	}

}
