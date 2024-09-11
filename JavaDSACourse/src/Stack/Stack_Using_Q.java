package Stack;

import Queue.DynamicQueue;

public class Stack_Using_Q {
	protected DynamicQueue q;
	public Stack_Using_Q() {
		q=new DynamicQueue();
	}
	public boolean isFull() {
	  return q.isFull();
	}
	public boolean isEmpty() {
		return q.isEmpty();
		}
	public void push(int n) throws Exception {
		DynamicQueue h=new DynamicQueue();
		while(!q.isEmpty()) {
			h.Enqueue(q.Deque()); 
		}
		q.Enqueue(n);
		while(!h.isEmpty()) {
			q.Enqueue(h.Deque()); 
		}
	}
	public int  pop() throws Exception {
		return q.Deque();
	}
	
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Stack_Using_Q st=new Stack_Using_Q();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.pop());

	}

}

/*
 * package Stack;

import Queue.DynamicQueue;

public class Stack_Using_Q_Optimized {
    protected DynamicQueue q1;
    protected DynamicQueue q2;

    public Stack_Using_Q_Optimized() {
        q1 = new DynamicQueue();
        q2 = new DynamicQueue();
    }

    // Check if the stack is full
    public boolean isFull() {
        return q1.isFull();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Push operation - O(1)
    public void push(int n) throws Exception {
        q1.Enqueue(n);
    }

    // Pop operation - O(n), then bring elements back to q1
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        // Move all elements except the last one from q1 to q2
        while (q1.size > 1) {
            q2.Enqueue(q1.Deque());
        }

        // Dequeue the last element (the top element to be popped)
        int poppedElement = q1.Deque();

        // Move all elements back from q2 to q1
        while (!q2.isEmpty()) {
            q1.Enqueue(q2.Deque());
        }

        return poppedElement;
    }

    public static void main(String[] args) throws Exception {
        Stack_Using_Q_Optimized st = new Stack_Using_Q_Optimized();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.pop()); // Output: 40
        System.out.println(st.pop()); // Output: 30
        st.push(50);
        System.out.println(st.pop()); // Output: 50
        System.out.println(st.pop()); // Output: 20
    }
}
*/
