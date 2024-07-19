package Contest4_2D_and_BinarySearch;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        System.out.println(square(n));
		    }
		    public static int square(int n){
		        if(n==1|| n==0){
		            return n;
		        }
		        int hi=n/2;
		        int lo=2;
		        int ans=0;
		       while(lo<=hi){
		           int mid=(lo+hi)/2;
		           if(mid*mid==n){
		               return mid;
		           }
		           if(mid*mid<n){
		               lo=mid+1;
		               ans=mid;
		           }
		           else{
		               hi=mid-1;
		           }
		       }
		       return ans;

		    }

	
}
