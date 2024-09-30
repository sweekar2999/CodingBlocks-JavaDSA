package Contest8_Trees_andLeetcode;

public class Validate_BST_Leetcode {
    public boolean isValidBST(TreeNode root) {
        return isvalid(root).isBST;
    }
    public bstpair isvalid(TreeNode root) {
        if (root == null) {
            return new bstpair();
        }

        bstpair left = isvalid(root.left);
        bstpair right = isvalid(root.right);

        bstpair self = new bstpair();
        self.min = Math.min(root.val, Math.min(left.min, right.min));
        self.max = Math.max(root.val, Math.max(left.max, right.max));

        self.isBST = left.isBST && right.isBST && root.val > left.max && root.val < right.min;

        return self;
    }
    class bstpair {
        boolean isBST = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Validate_BST_Leetcode obj = new Validate_BST_Leetcode();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);
        
        boolean isValid = obj.isValidBST(root);
        System.out.println("Is the tree a valid BST? " + isValid);
    }
}
