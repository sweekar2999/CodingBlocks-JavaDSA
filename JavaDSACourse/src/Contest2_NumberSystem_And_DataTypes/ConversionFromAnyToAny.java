package Contest2_NumberSystem_And_DataTypes;
import java.util.*;

public class ConversionFromAnyToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       int num=sc.nextInt();
       int sum=0;
       int mul=1;
       while(num>0) {
    	   int rem=num%10;
    	   sum=sum+rem*mul;
    	   mul=mul*n1;
    	   num=num/10;
       }
       System.out.println("the number in decimal is:"+sum);
       int num2=sum;
       int mul2=1;
       int sum2=0;
       while(num2>0) {
    	   int rem2=num2%n2;
    	   sum2=sum2+rem2*mul2;
    	   mul2=mul2*10;
    	   num2=num2/n2;
    	   
       }
       System.out.println("the number in destination  is:"+sum2);
	}

}
