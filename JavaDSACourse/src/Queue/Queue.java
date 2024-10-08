package Queue;

public class Queue {
	protected int arr[];
	protected int front =0;
	protected int size =0;
	
	public Queue() {
		this.arr = new int[5];
	}
	
	public Queue(int size) {
		this.arr = new int[size];
	}
	
	public boolean isFull() {
		return this.size == arr.length;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void Enqueue(int n) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is Already full");
		}
		int idx = (front+ size)% arr.length;
		arr[idx] = n;
		this.size++;
	}
	public int Deque() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is Already full");
		}
		int val = arr[front];
		arr[front] = 0;
		front = (front+1)%arr.length;
		this.size--;
		return val;
	}
	public void display() {
		for (int i = 0; i < size; i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx]+ " ");
			
		}
	}


}
