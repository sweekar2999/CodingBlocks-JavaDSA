package Contest8_Trees_andLeetcode;

public class Balanced_BinaryTree {
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
    }
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    private int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Balanced_BinaryTree balancedTreeCheck = new Balanced_BinaryTree();
        TreeNode root = balancedTreeCheck.new TreeNode(1);
        root.left = balancedTreeCheck.new TreeNode(2);
        root.right = balancedTreeCheck.new TreeNode(3);
        root.left.left = balancedTreeCheck.new TreeNode(4);
        boolean result = balancedTreeCheck.isBalanced(root);
        System.out.println("Is the binary tree balanced? " + result); 
    }
}
