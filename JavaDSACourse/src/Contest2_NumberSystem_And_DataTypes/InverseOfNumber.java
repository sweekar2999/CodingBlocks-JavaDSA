package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class InverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int place=1;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+(int)(Math.pow(10, rem-1)*place);
			n=n/10;
			place++;
			
		}
		System.out.println(sum);

	}

}
