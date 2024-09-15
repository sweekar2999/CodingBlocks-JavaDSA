package Contest7_Stack_LL_and_Queue;

public class Remove_Cycle {
    public class Node {
        protected int val;
        protected Node next;


        public Node() {
            this.val = -1;
            this.next = null;
        }

  
        public Node(int n) {
            this.val = n;
            this.next = null;
        }
    }

    public Node hasCycle(Node head) {
        if (head == null || head.next == null) {
            return null; 
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 

            if (slow == fast) { 
                return slow; 
            }
        }

        return null; 
    }
    public void removeCycle1(Node head) {
        Node meet = hasCycle(head);
        if (meet == null) {
            return; 
        }

        Node start = head;

        while (start != null) {
            Node temp = meet;
            while (temp.next != meet) {
                if (temp.next == start) {
                    temp.next = null; 
                    return;
                }
                temp = temp.next;
            }

            start = start.next;
        }
    }
    public void removeCycle2(Node head) {
    	Node meet=hasCycle(head);
    	Node temp=meet;
    	int count=1;
    	while(temp.next!=meet) {
    		count++;
    		temp=temp.next;
    	}
    	Node fast=head;
    	Node slow=head;
    	for(int i=0;i<count;i++) {
    		fast=fast.next;
    	}
    	while(fast.next!=slow.next) {
    		fast=fast.next;
    		slow=slow.next;
    	}
    	fast.next=null;
    	
    	
    }
    public void floydCycle(Node head) {
    	Node meet=hasCycle(head);
    	if(meet == null) {
			return;
		}
    	Node temp=meet;
    	Node fast=meet;
    	Node slow=head;
    	while(fast.next!=slow.next) {
    		fast=fast.next;
    		slow=slow.next;
    	}
    	fast.next=null;
    	
    	
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Remove_Cycle list = new Remove_Cycle();
        
        // Create a sample linked list with a cycle: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle)
        Node head = list.new Node(1);
        Node second = list.new Node(2);
        Node third = list.new Node(3);
        Node fourth = list.new Node(4);
        Node fifth = list.new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
      

        list.floydCycle(head);

        System.out.println("Linked List after removing cycle:");
        list.printList(head);
    }
}
