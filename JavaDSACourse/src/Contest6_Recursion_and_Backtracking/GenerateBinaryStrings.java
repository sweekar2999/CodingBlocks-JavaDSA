package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class GenerateBinaryStrings {

	   public static void main(String args[]) {
		     Scanner sc=new Scanner(System.in);
		     int t=sc.nextInt();
		      sc.nextLine(); 
		     while(t-->0){
		         String n=sc.nextLine();
		         BinaryString(n,"");
		     }
		    }
		    public static void BinaryString(String ques,String ans){
		        if(ques.length()==0){
		            System.out.print(ans+" ");
		            return;
		        }
		        char ch=ques.charAt(0);
		        if(ch=='?'){
		            
		            BinaryString(ques.substring(1),ans+"0");
		            BinaryString(ques.substring(1),ans+"1");
		        }
		        else{
		            BinaryString(ques.substring(1),ans+ch);
		        }
		    }

}
