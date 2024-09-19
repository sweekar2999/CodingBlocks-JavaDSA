package Contest8_Trees_andLeetcode;

public class Diameter_Of_BinaryTree {

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

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int self = height(root.left) + height(root.right) + 2;
        return Math.max(Math.max(left, right), self);
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
        Diameter_Of_BinaryTree obj = new Diameter_Of_BinaryTree();
        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);

        System.out.println("Diameter of the tree: " + obj.diameterOfBinaryTree(root));
    }
}
