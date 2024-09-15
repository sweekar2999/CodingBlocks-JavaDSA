package Contest7_Stack_LL_and_Queue;


public class LL_Cycle_Detection {
	public class Node{
		int val;
		Node next;
		public Node() {
			
		}
		public Node(int val) {
			this.val=val;
		}
		public Node(int val, Node next) {
			this.val=val;
			this.next=next;
		}
	}
		
		 public Boolean isCycle(Node head) {
	            Node fast = head;
	            Node slow = head;
	            while (fast != null && fast.next != null) {
	                fast = fast.next.next;
	                slow = slow.next;
	                if(fast==slow) {
	                	return true;
	                }
	            }
	            return false;
	            }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   LL_Cycle_Detection list = new LL_Cycle_Detection();
	        Node head = list.new Node(1);
	        Node second = list.new Node(2);
	        Node third = list.new Node(3);
	        Node fourth = list.new Node(4);
	        Node fifth = list.new Node(5);
	        head.next = second;
	        second.next = third;
	        third.next = fourth;
	        fourth.next = fifth;
	        fifth.next=head;
	        System.out.println("Cycle detected: " + list.isCycle(head));
          
	}

}
