package Contest8_Trees_andLeetcode;

public class Delete_Node_BST {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }
    static class Solution {
        private int Max(TreeNode root) {
            if (root == null) {
                return Integer.MIN_VALUE;
            }
            int r = Max(root.right);
            return Math.max(root.val, r);
        }
        public TreeNode deleteNode(TreeNode root, int key) {
            if (root == null) {
                return null;
            }
            if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else if (root.val < key) {
                root.right = deleteNode(root.right, key);
            } else {
              
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                } else {
                    
                    int leftMax = Max(root.left);
                    root.val = leftMax; 
                    root.left = deleteNode(root.left, leftMax); 
                }
            }
            return root;
        }
    }
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Delete_Node_BST bst = new Delete_Node_BST();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        Solution solution = new Solution();
        root = solution.deleteNode(root, 3);
        System.out.println("In-order traversal of the modified BST:");
        bst.inorderTraversal(root);  
    }
}
