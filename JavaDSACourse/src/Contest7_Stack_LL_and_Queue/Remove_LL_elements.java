package Contest7_Stack_LL_and_Queue;


public class Remove_LL_elements {
  
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        
        ListNode current = dummy; 
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
      
    	   ListNode head = new ListNode(1);
           head.next = new ListNode(2);
           head.next.next = new ListNode(3);
           head.next.next.next = new ListNode(4);
           head.next.next.next.next = new ListNode(5);
           head.next.next.next.next.next=new ListNode(6);
        System.out.println("Original list:");
        printList(head);
        ListNode result = removeElements(head, 3);
        System.out.println("Updated list after removing 6:");
        printList(result);
    }
}
