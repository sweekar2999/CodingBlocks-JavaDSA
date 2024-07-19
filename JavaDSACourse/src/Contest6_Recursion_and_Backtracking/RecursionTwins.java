package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class RecursionTwins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=Twins(s,0);
		System.out.println(c);
	}
	public static int Twins(String ques,int index) {
		int count=0;
		if(index==ques.length()-2) {
			return 0;
		}
		if(ques.charAt(index)==ques.charAt(index+2)) {
			count=1;
		}
		else {
			count=0;
		}
		return count + 	Twins(ques,index+1);
	}

}
