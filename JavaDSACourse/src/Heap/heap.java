package Heap;
import java.util.ArrayList;
//When to u use heap/priority queue 
//when we need to sort the array for single step and when we need min element in log(n) time
public class heap {
	private ArrayList<Integer> h1;
	public heap() {
		h1=new ArrayList<>();
	}
	public void add(int val) {
		h1.add(val);
		upheapify(h1.size()-1);
	}
	public void upheapify(int ci) {
		int pi=(ci-1)/2;
		if(h1.get(ci)< h1.get(pi)) {
			swap(pi,ci);
			upheapify(pi);
		}
		
	}
	public void swap(int pi,int ci) {
	// TODO Auto-generated method stub
	int tc = h1.get(ci);
	int tp = h1.get(pi);
	
	h1.set(pi, tc);
	h1.set(ci, tp);	
}
	public int peek() {
		return h1.get(0);
	}
	
	public void Display() {
		System.out.println(h1);
	}
	public int remove() {
		int rv=h1.get(0);
		swap(0,h1.size()-1);
		h1.remove(h1.size()-1);
		downheapify(0);
		return rv;
		
	}
	

	private void downheapify(int i) {
		// TODO Auto-generated method stub
		int c1=2*i+1;
		int c2=2*i+2;
		int min=i;
		if(c1<h1.size() && h1.get(min)>h1.get(c1)) {
			min=c1;
		}
		if(c2<h1.size() && h1.get(min)>h1.get(c2)) {
			min=c2;
		}
		if(min!=i) {
			swap(min,i);
			downheapify(min);
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heap h=new heap();
		h.add(4);
		h.add(5);
		h.add(20);
		h.add(-1);
		h.add(2);
		h.add(3);
		h.add(11);
		h.add(9);
		h.add(8);
		h.add(100);
		
		h.Display();
		h.remove();
		h.Display();
		
		System.out.println(h.peek());
		

	}

}
