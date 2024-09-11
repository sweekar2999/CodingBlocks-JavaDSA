package Stack;

public class DynamicStack extends Stack {
	public  DynamicStack() {
		super();
	}
	public DynamicStack(int size) {
		super(size);
	}
	@Override
	public void push(int n) throws Exception{
		if(isFull()) {
			int newArr[]=new int[2*arr.length];
			for(int i=0;i<arr.length;i++) {
				newArr[i]=arr[i];
			}
			
			arr=newArr;
		}
		super.push(n);
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack st=new DynamicStack(2);
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.display();
		

	}

}
