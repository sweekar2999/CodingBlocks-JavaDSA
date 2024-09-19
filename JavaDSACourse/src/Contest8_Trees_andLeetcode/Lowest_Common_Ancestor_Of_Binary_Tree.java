package Contest8_Trees_andLeetcode;

public class Lowest_Common_Ancestor_Of_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null){
	            return null;
	        }
	        if(root==p || root==q){
	            return root;
	        }
	         
	        TreeNode left=lowestCommonAncestor(root.left,p,q); 
	        TreeNode right=lowestCommonAncestor(root.right,p,q);
	        if(left!=null && right!=null){
	            return root;
	        }
	        else if(left!=null){
	            return left;
	        }
	        else{return right;}

	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    }
}
