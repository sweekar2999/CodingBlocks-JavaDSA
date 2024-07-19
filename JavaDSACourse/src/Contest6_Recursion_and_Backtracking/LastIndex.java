package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class LastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        // Your Code Here
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int arr[]=new int[n];
		        for(int i=0;i<arr.length;i++){
		            arr[i]=sc.nextInt();
		        }
		        int tar=sc.nextInt();
		        last(arr,tar,arr.length-1);
		    }
		    public static void last(int arr[],int tar,int idx){
		        if(idx<0){
		            System.out.println("-1");
		            return;
		        }
		      if(arr[idx]==tar){
		        System.out.println(idx);
		        return ;
		      }
		      last(arr,tar,idx-1);
		    }
	

}
