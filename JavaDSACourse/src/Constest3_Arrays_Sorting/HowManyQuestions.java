package Constest3_Arrays_Sorting;
import java.util.*;
public class HowManyQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       int count=0;
                for(int i = 0; i < n; i++) {
	    	   int petya = sc.nextInt();
	            int vasya = sc.nextInt();
	            int tonya = sc.nextInt();
	            if(petya+vasya+tonya>=2) {
	            	count++;
	            }
	       }
                System.out.println(count);

	}

}
