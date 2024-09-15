package Contest7_Stack_LL_and_Queue;

public class Intersection_LinkedList {

    public class Node {
        int val;
        Node next;
        Node(int x) {
            val = x;
            next = null;
        }
    }

    public Node getIntersectionNode(Node headA, Node headB) {
       
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        while (lenA > lenB) {
            headA = headA.next;
            lenA--;
        }
        while (lenB > lenA) {
            headB = headB.next;
            lenB--;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        
        return headA; 
    }
    private int getLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Intersection_LinkedList list = new Intersection_LinkedList();
        Node headA = list.new Node(1);
        Node secondA = list.new Node(2);
        Node thirdA = list.new Node(3);

        Node headB = list.new Node(4);
        Node secondB = list.new Node(5);

        Node commonNode1 = list.new Node(6);
        Node commonNode2 = list.new Node(7);
        headA.next = secondA;
        secondA.next = thirdA;
        thirdA.next = commonNode1;
        headB.next = secondB;
        secondB.next = commonNode1;
        commonNode1.next = commonNode2;
        Node intersection = list.getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection Node value: " + intersection.val);
        } else {
            System.out.println("No intersection found.");
        }
    }
}
