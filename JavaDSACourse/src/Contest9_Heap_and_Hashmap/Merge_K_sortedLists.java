package Contest9_Heap_and_Hashmap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_sortedLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + (next != null ? " -> " + next : "");
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val; 
            }
        });

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.offer(lists[i]);
            }
        }

        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while (!pq.isEmpty()) {
            ListNode rv = pq.poll();
            dummy.next = rv;
            dummy = rv;
            if (rv.next != null) {
                pq.offer(rv.next);
            }
        }

        return temp.next;
    }
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Merge_K_sortedLists obj = new Merge_K_sortedLists();

        ListNode list1 = createList(new int[]{1, 4, 5});
        ListNode list2 = createList(new int[]{1, 3, 4});
        ListNode list3 = createList(new int[]{2, 6});
        ListNode[] lists = new ListNode[]{list1, list2, list3};
        ListNode mergedList = obj.mergeKLists(lists);
        System.out.println("Merged List:");
        System.out.println(mergedList);
    }
}
