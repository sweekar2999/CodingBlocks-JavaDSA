package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=2;i<n;i++) {
	if(n%i==0) {
		System.out.println("not Prime");
	return;
	}
}
 
System.out.println(" prime");

	}

}
