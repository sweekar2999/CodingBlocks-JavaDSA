package Contest7_Stack_LL_and_Queue;

import java.util.Scanner;

public class Rotate_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (k == 0) {
            return head; 
        }
        ListNode slow = head;
        for (int i = 0; i < size - k - 1; i++) {
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        ListNode newTail = newHead;
        while (newTail.next != null) {
            newTail = newTail.next;
        }
        newTail.next = head;

        return newHead;
    }
    public static ListNode createListFromArray(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        for (int value : arr) {
            tail.next = new ListNode(value);
            tail = tail.next;
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        ListNode head = createListFromArray(arr);
        Rotate_list solution = new Rotate_list();
        ListNode result = solution.rotateRight(head, k);
        printList(result);
    }
}
