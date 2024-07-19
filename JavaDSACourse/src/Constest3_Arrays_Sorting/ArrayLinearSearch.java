package Constest3_Arrays_Sorting;
import java.util.*;
public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			if(m==a[i]) {
				System.out.println(i);
				flag=true;
				break;
			
			}
	
		}
		if(!flag) {
		System.out.print("-1");
		}

	}

}
