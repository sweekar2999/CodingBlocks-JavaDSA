package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class Simple_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		while(sc.hasNextInt()) {
			int num=sc.nextInt();
			sum=sum+num;
			if(sum<0) {
				break;
			}
			System.out.println(num);
			
		}
       
	}

}
