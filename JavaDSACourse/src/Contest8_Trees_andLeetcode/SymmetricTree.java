package Contest8_Trees_andLeetcode;

public class SymmetricTree {

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

    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.left, root.right);
    }

    private boolean symmetric(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        boolean left = symmetric(root1.left, root2.right);
        boolean right = symmetric(root1.right, root2.left);
        return left && right;
    }

    public static void main(String[] args) {
        SymmetricTree symTree = new SymmetricTree();
        SymmetricTree.TreeNode root = symTree.new TreeNode(1);
        root.left = symTree.new TreeNode(2);
        root.right = symTree.new TreeNode(2);
        root.left.left = symTree.new TreeNode(3);
        root.left.right = symTree.new TreeNode(4);
        root.right.left = symTree.new TreeNode(4);
        root.right.right = symTree.new TreeNode(3);

        boolean result = symTree.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result); 
    }
}
