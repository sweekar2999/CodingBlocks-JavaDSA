package Contest5_Strings;
import java.util.*;
public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			String ans="";
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			String []s=new String[n];
			for(int i=0;i<n;i++) {
				s[i]=String.valueOf(arr[i]);
			}
			Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
			
			
			for(int i=0;i<n;i++) {
				ans=ans+s[i];
			}
			System.out.println(ans);
		}
		

	}

}
