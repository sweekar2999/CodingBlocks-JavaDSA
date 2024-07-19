package Contest5_Strings;
import java.util.*;
public class StringsMaxFrequencyCharacter {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
         char maxFreq=MaxF(s);
         System.out.println(maxFreq);
		

	}
	public static char MaxF(String s) {
		int freq[]=new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		int max=-1;
		char maxi=' ';
		for(int i=0;i<s.length();i++) {
			if(freq[s.charAt(i)]>max) {
				max=freq[s.charAt(i)];
				maxi=s.charAt(i);
			}
		}
		return maxi;
	*/
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
        char ch=s.charAt(0);
        int count=1;
        int max=0;
        char ans = 0;
        for(int i=1;i<s.length();i++) {
        	char ch2=s.charAt(i);
        	if(ch==ch2) {
        		count++;
        	}
        	else {
        		if(count>max) {
        			ans=ch;
            		max=count;
            		ch=ch2;
            		count=1;
        		}
        		else {
        			count=1;
        			ch=ch2;
        		}
        		
        	}
        }
    	if(count>max) {
			ans=ch;

		}
         System.out.println(ans);
		
	}

}

