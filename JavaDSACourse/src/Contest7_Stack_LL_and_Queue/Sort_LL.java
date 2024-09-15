/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
class Solution {

  
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

    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head; 

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

  
    public ListNode sortList(ListNode head) {
       
        if(head==null || head.next==null) {
			  return head;
		  }
		  ListNode mid=middleNode(head);
		  ListNode newHead=mid.next;
		  mid.next=null;
		  ListNode list1=sortList(head);
		  ListNode list2=sortList(newHead);
		  return mergeTwoLists(list1,list2);
       
    }
}
*/
