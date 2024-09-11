package Queue;

public class DynamicQueue extends Queue {

	    public DynamicQueue() {
	        super();
	    }

	    public DynamicQueue(int size) {
	        super(size);
	    }

	
	    @Override
	    public void Enqueue(int n) throws Exception {
	        if (isFull()) {
	           
	            int[] newArr = new int[arr.length * 2];

	           
	            for (int i = 0; i < size; i++) {
	                int idx = (front + i) % arr.length;
	                newArr[i] = arr[idx];
	            }
	            arr = newArr;
	        }
	        super.Enqueue(n);
	    }

	    public static void main(String[] args) throws Exception {
	        DynamicQueue dynamicQueue = new DynamicQueue(3);

	        dynamicQueue.Enqueue(10);
	        dynamicQueue.Enqueue(20);
	        dynamicQueue.Enqueue(30);

	        System.out.println("Before resizing:");
	        dynamicQueue.display();  // Output: 10 20 30

	        // This will trigger resizing as the queue is full
	        dynamicQueue.Enqueue(40);

	        System.out.println("\nAfter resizing:");
	        dynamicQueue.display();  // Output: 10 20 30 40
	    }
	

	
	



}
