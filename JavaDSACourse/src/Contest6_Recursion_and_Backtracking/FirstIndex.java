package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class FirstIndex {

	  public static void main(String args[]) {
	        // Your Code Here
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=sc.nextInt();
	        }
	        int tar=sc.nextInt();
	        first(arr,tar,0);
	    }
	    public static void first(int arr[],int tar,int idx){
	        if(idx>=arr.length){
	            System.out.println("-1");
	            return;
	        }
	      if(arr[idx]==tar){
	        System.out.println(idx);
	        return ;
	      }
	      first(arr,tar,idx+1);
	    }
	}