package Contest7_Stack_LL_and_Queue;

public class Sum_Of_LL {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public Node addLL(Node l1, Node l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;

        if (l1 != null) {
            sum += l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            sum += l2.val;
            l2 = l2.next;
        }

        int newCarry = sum / 10;
        sum = sum % 10;

        Node result = new Node(sum);
        result.next = addLL(l1, l2, newCarry);
        return result;
    }

    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        return prev;
    }

    public static void main(String[] args) {
        Sum_Of_LL sumOfLL = new Sum_Of_LL();

        Node l1 = new Node(5);
        l1.next = new Node(6);
        l1.next.next = new Node(3);

        Node l2 = new Node(8);
        l2.next = new Node(4);
        l2.next.next = new Node(2);
        l1 = sumOfLL.reverseList(l1);
        l2 = sumOfLL.reverseList(l2);

        Node result = sumOfLL.addLL(l1, l2, 0);

    
        result = sumOfLL.reverseList(result);

        sumOfLL.printList(result);
    }
}
