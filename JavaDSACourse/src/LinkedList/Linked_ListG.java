package LinkedList;

public class Linked_ListG<T> {

    // Node class
    public class Node {
        T val;
        Node next;

        // Parameterized constructor
        public Node(T n) {
            this.val = n;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // Add element at the beginning of the list
    public void addFirst(T n) {
        Node nn = new Node(n);
        if (this.head == null) {
            this.head = nn;
            this.tail = nn;
        } else {
            nn.next = this.head;
            this.head = nn;
        }
        this.size++;
    }

    // Add element at the end of the list
    public void addLast(T n) {
        if (this.head == null) {
            addFirst(n);
            return;
        }
        Node nn = new Node(n);
        this.tail.next = nn;
        this.tail = nn;
        this.size++;
    }

    // Add element at a specific index
    public void addAtIndex(int idx, T n) throws Exception {
        if (idx < 0 || idx > size) {
            throw new Exception("Invalid index");
        }

        if (idx == 0) {
            addFirst(n);
        } else if (idx == size) {
            addLast(n);
        } else {
            Node nn = new Node(n);
            Node temp = this.head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            nn.next = temp.next;
            temp.next = nn;
            this.size++;
        }
    }

    // Remove element at a specific index
    public void removeAtIndex(int idx) throws Exception {
        if (idx < 0 || idx >= size) {
            throw new Exception("Invalid index");
        }

        if (idx == 0) {
            removeFirst();
        } else if (idx == size - 1) {
            removeLast();
        } else {
            Node temp = this.head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            this.size--;
        }
    }

    // Remove the first element
    public void removeFirst() throws Exception {
        if (this.head == null) {
            throw new Exception("List is empty");
        }
        this.head = this.head.next;
        this.size--;
        if (this.size == 0) {
            this.tail = null;
        }
    }

    // Remove the last element
    public void removeLast() throws Exception {
        if (this.head == null) {
            throw new Exception("List is empty");
        }

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
        } else {
            Node temp = this.head;
            while (temp.next != this.tail) {
                temp = temp.next;
            }
            temp.next = null;
            this.tail = temp;
        }
        this.size--;
    }

    // Display the elements of the list
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        try {
            Linked_ListG<Double> l1 = new Linked_ListG<>();
            l1.addFirst(1.1);
            l1.addFirst(2.2);
            l1.addFirst(3.2);
            l1.addFirst(4.5);
            l1.addLast(5.3);
            l1.display(); // Output: 4 -> 3 -> 2 -> 1 -> 5 -> END

            l1.addAtIndex(2, 10.4);
            l1.display(); // Output: 4 -> 3 -> 10 -> 2 -> 1 -> 5 -> END

            l1.removeAtIndex(2);
            l1.display(); // Output: 4 -> 3 -> 2 -> 1 -> 5 -> END
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
