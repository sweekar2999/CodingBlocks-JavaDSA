package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class Count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num= sc.nextInt();
		int digit=sc.nextInt();
		int count=0;
		while(num>0) {
			int currDigit=num%10;
			if(currDigit==digit) {
				count++;
			}
			num=num/10;
			
		}
		System.out.println(count);

	}

}
