package Contest2_NumberSystem_And_DataTypes;

public class Decimal2Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%2;
			sum=sum+ rem*mul;
			n=n/2;
			mul=mul*10;
			
		}
		System.out.println(sum);

	}

}
