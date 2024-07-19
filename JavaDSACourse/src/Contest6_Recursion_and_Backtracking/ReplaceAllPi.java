package Contest6_Recursion_and_Backtracking;
import java.util.*;
public class ReplaceAllPi {

	 public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine(); 
    for (int i = 0; i < n; i++) {
        String str = sc.nextLine();
        replacePi(str,"");
    }

}
public static void replacePi(String ques, String ans) {
    if (ques.length() == 0) {
        System.out.print(ans);
        return;
    }
    if (ques.length() > 1 && ques.substring(0, 2).equals("pi")) {
        replacePi(ques.substring(2), ans + "3.14");
    } else {
        replacePi(ques.substring(1), ans + ques.charAt(0));
    }
}

}
