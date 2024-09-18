package Contest7_Stack_LL_and_Queue;import java.util.Scanner;

public class Linked_List_k_Append {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode appendLastKToFront(ListNode head, int K) {
        if (head == null || K == 0) {
            return head;
        }
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        K = K % size;
        if (K == 0) {
            return head;  
        }
        ListNode slow = head;
        for (int i = 0; i < size - K - 1; i++) {
            slow = slow.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        ListNode oldTail = newHead;
        while (oldTail.next != null) {
            oldTail = oldTail.next;
        }
        oldTail.next = head;

        return newHead;
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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        for (int i = 0; i < N; i++) {
            tail.next = new ListNode(scanner.nextInt());
            tail = tail.next;
        }
        int K = scanner.nextInt();
        scanner.close();
        ListNode result = appendLastKToFront(dummy.next, K);
        printList(result);
    }
}
