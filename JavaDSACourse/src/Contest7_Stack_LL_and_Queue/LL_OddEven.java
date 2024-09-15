package Contest7_Stack_LL_and_Queue;
import java.util.*;

class Node {
    int val;
    Node next;

    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

public class LL_OddEven {

    public void rearrangeList(Node head) {
        Node oddHead = new Node(); 
        Node evenHead = new Node(); 
        Node odd = oddHead;
        Node even = evenHead;

        Node current = head;
        while (current != null) {
            if (current.val % 2 != 0) {
                odd.next = current;
                odd = odd.next;
            } else {
                even.next = current;
                even = even.next;
            }
            current = current.next;
        }
        even.next = null;
        odd.next = evenHead.next;
        printList(oddHead.next);
    }


    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of nodes
        int n = scanner.nextInt();
        
        // Initialize the head of the linked list
        Node head = null;
        Node tail = null;

        // Read the node values and construct the linked list
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        scanner.close();

        LL_OddEven solution = new LL_OddEven();

        System.out.println("Original Linked List:");
        solution.printList(head);
        System.out.println("Rearranged Linked List:");
        solution.rearrangeList(head);
    }
}
