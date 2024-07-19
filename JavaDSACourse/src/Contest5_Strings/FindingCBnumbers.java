package Contest5_Strings;
import java.util.*;
public class FindingCBnumbers {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String s = sc.nextLine();
        
        int count = 0;
        boolean[] visited = new boolean[s.length()];

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                long l = Long.parseLong(s.substring(j, j + i));
                if (isCB(l) && ifVisited(visited, j, j + i)) {
                   
                    count++;
                    for (int k = j; k < j + i; k++) { 
                        visited[k] = true;
                    }
                }
            }
        }
        
        System.out.println(count);
        sc.close();
    }

    public static boolean isCB(long l) {
        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        if (l == 0 || l == 1) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (l == arr[i]) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (l % arr[i] == 0) {
                return false;
            }
            
        }
        return true;
    }

    public static boolean ifVisited(boolean visited[], int i, int j) {
        for (int k = i; k < j; k++) {
            if (visited[k] == true) {
                return false;
            }
        }
        return true;
    }

}
