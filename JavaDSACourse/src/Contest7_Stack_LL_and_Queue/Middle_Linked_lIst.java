package Contest7_Stack_LL_and_Queue;

public class Middle_Linked_lIst {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
            
//            int size=0;
//            ListNode temp=head;
//            while(temp!=null){
//                size++;
//                temp=temp.next;
//            }
//            int mid=size/2;
//            temp=head;
//            for(int i=0;i<mid;i++){
//                temp=temp.next;
//            }
//        return temp;
        }
    }

    public static void main(String[] args) {
        Middle_Linked_lIst list = new Middle_Linked_lIst();
        Solution solution = list.new Solution();

        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = list.new ListNode(1);
        head.next = list.new ListNode(2);
        head.next.next = list.new ListNode(3);
        head.next.next.next = list.new ListNode(4);
        head.next.next.next.next = list.new ListNode(5);

        // Find the middle node
        ListNode middle = solution.middleNode(head);
        System.out.println("Middle node value: " + middle.val); // Output should be 3
    }
}
