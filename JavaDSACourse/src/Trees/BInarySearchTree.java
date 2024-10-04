package Trees;


public class BInarySearchTree {
	public class TreeNode{
		protected int val;
		TreeNode left;
		TreeNode right;
	}
	private TreeNode root;
	BInarySearchTree(int arr[]){
		this.root=createTree(arr, 0, arr.length-1);
	}
	public TreeNode createTree(int in[],int si,int end) {
		if(si>end) {
			return null;
		}
		int mid=(si+end)/2;
		TreeNode nn=new TreeNode();
		nn.val=in[mid];
		nn.left=createTree(in,si,mid-1);
		nn.right=createTree(in,mid+1,end);
		return nn;
	}
	public void Display() {
		display(root);
	}
         private void display(TreeNode temp) {
	        if (temp == null) {
	            return;
	        }
	        String s = "" + temp.val;
	        if (temp.left != null) {
	            s = temp.left.val + "<--" + s;
	        } else {
	            s = ". <--" + s;
	        }
	        if (temp.right != null) {
	            s = s + "-->" + temp.right.val;
	        } else {
	            s = s + "--> .";
	        }
	        System.out.println(s);
	        display(temp.left);
	        display(temp.right);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in[] = {15,50,60,75,100,125,150,175};
		BInarySearchTree bst = new BInarySearchTree(in);
		
		bst.Display();
	}

}
