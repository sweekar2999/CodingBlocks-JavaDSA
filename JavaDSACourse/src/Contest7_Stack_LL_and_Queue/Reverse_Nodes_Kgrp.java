package Contest7_Stack_LL_and_Queue;

import java.util.Scanner;

public class Reverse_Nodes_Kgrp {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int count = 0;
        while (curr != null && count < k) {
            count++;
            curr = curr.next;
        }
        if (count == k) {
            ListNode prev = null;
            curr = head;
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head.next = reverseKGroup(curr, k);
            
            return prev; 
        }
        return head;
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
        ListNode result = reverseKGroup(head, k);

        printList(result);
    }
}
