package Contest8_Trees_andLeetcode;

public class Flip_Equivalent_BInaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false; 
        }
        if (root1.val != root2.val) {
            return false; 
        }
        boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
        boolean noFlip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);

        return flip || noFlip;
    }

    public static void main(String[] args) {
    	Flip_Equivalent_BInaryTree flipTrees = new Flip_Equivalent_BInaryTree();
    	Flip_Equivalent_BInaryTree.TreeNode root1 = flipTrees.new TreeNode(1);
    	Flip_Equivalent_BInaryTree.TreeNode root2 = flipTrees.new TreeNode(1);
        
        root1.left = flipTrees.new TreeNode(2);
        root1.right = flipTrees.new TreeNode(3);
        root1.left.left = flipTrees.new TreeNode(4);
        root1.left.right = flipTrees.new TreeNode(5);
        root1.right.left = flipTrees.new TreeNode(6);
        root1.left.right.left = flipTrees.new TreeNode(7);
        root1.left.right.right = flipTrees.new TreeNode(8);
       
        root2.left = flipTrees.new TreeNode(3);
        root2.right = flipTrees.new TreeNode(2);
        root2.right.left = flipTrees.new TreeNode(4);
        root2.right.right = flipTrees.new TreeNode(5);
        root2.left.right = flipTrees.new TreeNode(6);
        root2.right.right.left = flipTrees.new TreeNode(8);
        root2.right.right.right = flipTrees.new TreeNode(7);

    
        boolean result = flipTrees.flipEquiv(root1, root2);
        System.out.println("Are the trees flip equivalent? " + result); 
    }
}
