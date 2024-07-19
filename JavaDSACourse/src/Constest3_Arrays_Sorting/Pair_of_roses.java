package Constest3_Arrays_Sorting;
import java.util.*;
public class Pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						Scanner sc=new Scanner(System.in);
						int test=sc.nextInt();
                     for(int c=0;c<test;c++) {
						int num=sc.nextInt();
						int price[]=new int[num];
						for(int i=0;i<num;i++) {
							 price[i]=sc.nextInt();
						}
						int tc=sc.nextInt();
						 Arrays.sort(price);
						int p1=0;
						int p2=0;
						for(int i=0 ,j=num-1;i<=j;i++,j--) {
							int sum=price[i]+price[j];
							if(sum==tc) {
								p1=price[i];
								p2=price[j];
								i++;
								j--;
							}
							else if(sum>tc) {
								j--;
							}
							else {
								i++;
							}
						}
						 System.out.println("Deepak should buy roses whose prices are " + p1 + " and " + p2 + ".");
				            System.out.println(); 
                     }


	}

}
