package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class SplitArray {


    static int count=0;
    public static void main(String args[]) {

        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        split(arr,"","",0,0,0);
        System.out.println(count);
    }
    public static void split(int arr[],String group1,String group2,int sum1,int sum2,int idx){
         if (idx == arr.length) {
            if (sum1 == sum2) {
                count++;
                System.out.println(group1 + " and " + group2);
            }
            return;
        }
     split(arr,group1+arr[idx]+" ",group2,sum1+arr[idx],sum2,idx+1);
     split(arr,group1,group2+arr[idx]+" ",sum1,sum2+arr[idx],idx+1);
    }
}
