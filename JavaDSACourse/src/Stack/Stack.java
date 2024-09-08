package Stack;

public class Stack {
	protected int arr[];
	protected int top=-1;
	public Stack() {
		arr=new int[5];
	}
	public Stack(int size) {
		this.arr=new int[size];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
	public void push(int n) throws Exception{
		if(isFull()) {
			throw new Exception("Stack Is Full!");
		}
		top++;
		arr[top]=n;
	}
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is Empty!");
		}
		int val=arr[top];
		arr[top]=0;
		top--;
		return val;
		
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("NO ELEMENT IN STACK");
			return;
		}
		for(int i=top;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Bhai Stack khali h");
		}
		return arr[top];
	}
	public void clear() {
		for (int i = top; i>=0; i--) {
			this.arr[i] = 0;
		}
		top =-1;
	}
	
	public int size() {
		return top+1;
	}
	

}
