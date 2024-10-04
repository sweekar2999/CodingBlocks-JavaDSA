package Contest9_Heap_and_Hashmap;

import java.util.HashSet;

public class Intersection_Of_Two_Arrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> ans = new HashSet<>();
        for (int num : nums1) {
            h1.add(num);
        }
        for (int num : nums2) {
            if (h1.contains(num)) {
                ans.add(num);
            }
        }

        int[] arr = new int[ans.size()];
        int idx = 0;
        for (int i : ans) {
            arr[idx] = i;
            idx++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Intersection_Of_Two_Arrays obj = new Intersection_Of_Two_Arrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = obj.intersection(nums1, nums2);
        System.out.print("Intersection of the two arrays: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
