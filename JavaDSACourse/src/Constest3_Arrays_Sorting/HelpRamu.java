package Constest3_Arrays_Sorting;
import java.util.*;
public class HelpRamu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0) {
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		int c3=sc.nextInt();
		int c4=sc.nextInt();
		int n=sc.nextInt();
		int m=sc.nextInt();
		int rickshaw[]=new int[n];
		int []cab=new int[m];
		for(int i=0;i<rickshaw.length;i++) {
			rickshaw[i]=sc.nextInt();
		}
		for(int i=0;i<cab.length;i++) {
			cab[i]=sc.nextInt();
		}
		int rickcost=miniCost(rickshaw,c1,c2,c3);
		int cabcost=miniCost(cab,c1,c2,c3);
		int ans=Math.min(rickcost+cabcost, c4);
		System.out.println(ans);
		t--;
	}

}
public static int miniCost(int []arr,int c1, int c2,int c3) {
	int sum1=0;
	for(int i=0;i<arr.length;i++) {
		sum1+= Math.min(arr[i]*c1, c2);
	}
	return Math.min(sum1, c3);
	
}
}