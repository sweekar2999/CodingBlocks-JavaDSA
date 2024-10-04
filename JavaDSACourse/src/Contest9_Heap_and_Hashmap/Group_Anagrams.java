package Contest9_Heap_and_Hashmap;

import java.util.*;  

public class Group_Anagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sortedStr = new String(ch);
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(s);
            } else {
                map.put(sortedStr, new ArrayList<String>());
                map.get(sortedStr).add(s);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Group_Anagrams ga = new Group_Anagrams();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = ga.groupAnagrams(input);
        System.out.println(result);
    }
}
