package Queue;

import Stack.DynamicStack;

public class Queue_Using_Stack {
	protected DynamicStack q1;
	Queue_Using_Stack(){
		q1=new DynamicStack();
	}
	public boolean isFull() {
		return q1.isFull();
	}
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	public void Enqueue(int n) throws Exception{
		q1.push(n);
	}
	public int  Dequeue() throws Exception{
		DynamicStack q2=new DynamicStack();
		while(!q1.isEmpty()) {
			q2.push(q1.pop());
		}
		int val=q2.pop();
		while(!q2.isEmpty()) {
			q1.push(q2.pop());
		}
		return val;
		
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Queue_Using_Stack st=new Queue_Using_Stack();
		st.Enqueue(1);
		st.Enqueue(2);
		st.Enqueue(3);
		st.Enqueue(4);
		st.Enqueue(5);
		System.out.println(st.Dequeue());
		System.out.println(st.Dequeue());
		System.out.println(st.Dequeue());

	}

}
/*
 * package Queue;

import Stack.DynamicStack;

public class Queue_Using_Stack_Optimized {
    protected DynamicStack q1;
    protected DynamicStack q2;

    public Queue_Using_Stack_Optimized() {
        q1 = new DynamicStack();
        q2 = new DynamicStack();
    }

    // Check if the queue is full
    public boolean isFull() {
        return q1.isFull();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    // Enqueue operation - O(n)
    public void Enqueue(int n) throws Exception {
        // Move all elements from q1 to q2
        while (!q1.isEmpty()) {
            q2.push(q1.pop());
        }

        // Push the new element into q1
        q1.push(n);

        // Move everything back from q2 to q1
        while (!q2.isEmpty()) {
            q1.push(q2.pop());
        }
    }

    // Dequeue operation - O(1)
    public int Dequeue() throws Exception {
        if (q1.isEmpty()) {
            throw new Exception("Queue is empty");
        }

        // Pop the top element from q1 (which is the front of the queue)
        return q1.pop();
    }

    public static void main(String[] args) throws Exception {
        Queue_Using_Stack_Optimized queue = new Queue_Using_Stack_Optimized();

        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);
        queue.Enqueue(4);
        queue.Enqueue(5);

        System.out.println(queue.Dequeue()); // Output: 1
        System.out.println(queue.Dequeue()); // Output: 2
        System.out.println(queue.Dequeue()); // Output: 3
    }
}
*/
