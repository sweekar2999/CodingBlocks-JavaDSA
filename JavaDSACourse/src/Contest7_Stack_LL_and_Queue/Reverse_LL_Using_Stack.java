package Contest7_Stack_LL_and_Queue;
import java.util.Stack;

public class Reverse_LL_Using_Stack {
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;

        // Push all nodes to the stack
        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }


        ListNode newHead = st.pop(); 
        temp = newHead;

        while (!st.isEmpty()) {
            temp.next = st.pop(); 
            temp = temp.next;     
        }

        temp.next = null; 
        return newHead;
    }

    // Print the linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse_LL_Using_Stack list = new Reverse_LL_Using_Stack();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        list.printList(head);

        ListNode reversedHead = list.reverseList(head);

        System.out.println("Reversed Linked List:");
        list.printList(reversedHead);
    }
}

