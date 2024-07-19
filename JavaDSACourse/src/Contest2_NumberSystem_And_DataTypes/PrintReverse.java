package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int rem;
		while(num>0) {
			rem=num%10;
			rev=rem+rev*10;
			num=num/10;
		}
		System.out.println(rev);

	}

}
