package Contest2_NumberSystem_And_DataTypes;
import java.util.*;
public class Chewbecca_Numb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
          int n=sc.nextInt();
          int place=1;
          int ans=0;
          while(n>9) {
        	  int rem=n%10;
        	  if(rem<5) {
        		  ans=ans+(int)(rem*Math.pow(10,place-1));
        	  }
        	  else {
        		  ans=ans+(int)((9-rem)*Math.pow(10,place-1));
        	  }
        	  n=n/10;
        	  place++;
          }
          if(n==9 || n<5) {
        	  ans=ans+(int)(n*Math.pow(10,place-1));
          }
          else {
        	  ans=ans+(int)((9-n)*Math.pow(10,place-1)); 
          }
          System.out.println(ans);
	}

}
