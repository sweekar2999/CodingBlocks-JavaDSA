package Contest7_Stack_LL_and_Queue;
import java.util.*;

public class Kth_Element_From_the_Last_LL {
    public static class Node {
        protected int val;
        protected Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static Node createList(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return null; 
        }

        Node head = new Node(arr.get(0));
        Node curr = head;

        for (int i = 1; i < arr.size(); i++) {
            curr.next = new Node(arr.get(i));
            curr = curr.next;
        }

        return head;
    }
    public static int Soln(Node head, int k) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1; 
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            arr.add(num);
        }
        Node result1 = createList(arr);
        int k = sc.nextInt();
        int result = Soln(result1, k);
        System.out.println(result);

        sc.close();
    }
}
