package Contest7_Stack_LL_and_Queue;

public class Remove_Nth_Node_fromEnd {

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
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
       
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return head; 
            }
            fast = fast.next;
        }
        
        if (fast == null) {
            return head.next;  
        }
        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return head;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original List:");
        printList(head);
        Remove_Nth_Node_fromEnd solution = new Remove_Nth_Node_fromEnd();
        ListNode newHead = solution.removeNthFromEnd(head, 2);
        System.out.println("List after removing 2nd node from end:");
        printList(newHead);
    }
}
