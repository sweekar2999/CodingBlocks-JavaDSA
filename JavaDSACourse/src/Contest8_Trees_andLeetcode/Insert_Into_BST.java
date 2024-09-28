package Contest8_Trees_andLeetcode;

public class Insert_Into_BST {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Insert_Into_BST bst = new Insert_Into_BST();
        TreeNode root = null;
        root = bst.insertIntoBST(root, 5);
        root = bst.insertIntoBST(root, 2);
        root = bst.insertIntoBST(root, 7);
        root = bst.insertIntoBST(root, 1);
        root = bst.insertIntoBST(root, 3);
        System.out.println("In-order traversal of the BST:");
        bst.inorderTraversal(root); 
    }
}
