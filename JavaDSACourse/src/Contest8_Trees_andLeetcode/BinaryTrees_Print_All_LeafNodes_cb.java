package Contest8_Trees_andLeetcode;

import java.util.*;

public class BinaryTrees_Print_All_LeafNodes_cb {

    public static class TreeNode {
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

    private TreeNode root;

    public BinaryTrees_Print_All_LeafNodes_cb() {
        this.root = createTree();
    }
//INPUT IN LEVEL ORDER
    private TreeNode createTree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter node values in level order (-1 for null):");
        int rootData = sc.nextInt();
        if (rootData == -1) {
            return null;
        }

        TreeNode root = new TreeNode(rootData);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            int leftChildData = sc.nextInt();
            if (leftChildData != -1) {
                current.left = new TreeNode(leftChildData);
                queue.add(current.left);
            }

            int rightChildData = sc.nextInt();
            if (rightChildData != -1) {
                current.right = new TreeNode(rightChildData);
                queue.add(current.right);
            }
        }

        return root;
    }

    public static void printLeafNodes(TreeNode node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            System.out.print(node.val + " ");
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public static void main(String[] args) {
        BinaryTrees_Print_All_LeafNodes_cb tree = new BinaryTrees_Print_All_LeafNodes_cb();
        printLeafNodes(tree.root);
    }
}
