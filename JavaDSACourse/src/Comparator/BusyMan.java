package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BusyMan {
	public 	 static class Pair{
		public int st;
		public int et;
		public Pair() {
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			Pair[] p=new Pair[n];
			for(int i=0;i<n;i++) {
				p[i]=new Pair();
				p[i].st=sc.nextInt();
				p[i].et=sc.nextInt();
			}
			Arrays.sort(p,new Comparator<Pair>() {

				@Override
				public int compare(Pair o1, Pair o2) {
					// TODO Auto-generated method stub
					return o1.et-o2.et;
				}
				
				
			});
			int count=1;
			int ct=p[0].et;
			for(int i=1;i<p.length;i++) {
				if(p[i].st>=ct) {
					count++;
					ct=p[i].et;
				}
			}
			System.out.println(count);
		}
	}

	}

}



