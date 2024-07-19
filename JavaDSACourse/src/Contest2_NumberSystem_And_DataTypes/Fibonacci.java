package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int a=0,b=1,c;
           for(int i=0;i<n;i++) {
        	   c=a+b;
        	   a=b;
        	   b=c;
           }
           System.out.println(a);
	}

}
