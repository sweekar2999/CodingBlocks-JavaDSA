package Contest8_Trees_andLeetcode;

public class Create_Tree_Using_postorder_inorder {
    public static class TreeNode {
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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return soln(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode soln(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
        if (plo > phi || ilo > ihi) {
            return null;
        }
        TreeNode root = new TreeNode(post[phi]);
        int idx = -1;
        for (int i = ilo; i <= ihi; i++) {
            if (in[i] == post[phi]) {
                idx = i;
                break;
            }
        }
        int nel = idx - ilo;
        root.left = soln(post, plo, plo + nel - 1, in, ilo, idx - 1);
        root.right = soln(post, plo + nel, phi - 1, in, idx + 1, ihi);

        return root;
    }

    public static void main(String[] args) {
        Create_Tree_Using_postorder_inorder treeBuilder = new Create_Tree_Using_postorder_inorder();

        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = treeBuilder.buildTree(inorder, postorder);
        printInorder(root); 
    }
    public static void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.val + " ");
        printInorder(node.right);
    }
}
