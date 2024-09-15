package Contest7_Stack_LL_and_Queue;

public class Merge_2_Sorted_LL {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(); 
        ListNode temp = newHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 == null) {
            temp.next = list2;
        } else {
            temp.next = list1;
        }

        return newHead.next; 
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Merge_2_Sorted_LL mergeList = new Merge_2_Sorted_LL();
        ListNode list1 = mergeList.new ListNode(1);
        list1.next = mergeList.new ListNode(3);
        list1.next.next = mergeList.new ListNode(5);
        ListNode list2 = mergeList.new ListNode(2);
        list2.next = mergeList.new ListNode(4);
        list2.next.next = mergeList.new ListNode(6);
        ListNode mergedList = mergeList.mergeTwoLists(list1, list2);
        System.out.println("Merged Linked List:");
        mergeList.printList(mergedList);
    }
}
