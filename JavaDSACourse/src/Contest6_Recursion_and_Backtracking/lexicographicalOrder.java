package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class lexicographicalOrder {

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        lexo(n,0);
    }
    public static void lexo(int n,int ans){
if(ans>n){
    return ;
}
int i=0;
System.out.print(ans+" ");
if(ans==0){
    i=1;
}
for(;i<=9;i++){
    lexo(n,ans*10+i);
}
    }

}
