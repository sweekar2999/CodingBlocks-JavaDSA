package Contest5_Strings;
import java.util.*;
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

    
        String ans = "";

        char currentChar = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == currentChar) {
                count++;
            } else {
              
                ans += currentChar + "" + count;

                currentChar = ch;
                count = 1;
            }
        }

        ans += currentChar + "" + count;

    
        System.out.println(ans);

		
	}

}
