package Contest9_Heap_and_Hashmap;
import java.util.HashSet;
public class Longest_Consective_Sequence {

	    public static void main(String[] args) {
	        int[] nums = {100, 4, 200, 1, 3, 2};
	        Longest_Consective_Sequence lcs = new Longest_Consective_Sequence();
	        System.out.println("Longest consecutive sequence length: " + lcs.longestConsecutive(nums));
	    }

	    public int longestConsecutive(int[] nums) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : nums) {
	            set.add(num);
	        }

	        int longestStreak = 0;
	        for (int num : set) {
	            if (!set.contains(num - 1)) {
	                int currentNum = num;
	                int currentStreak = 1;

	                while (set.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }
	                longestStreak = Math.max(longestStreak, currentStreak);
	            }
	        }

	        return longestStreak;
	    }
	}


