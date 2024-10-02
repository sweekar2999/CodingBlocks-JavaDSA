package Trees;

import java.util.*;
public class InputFormat {


	    // TreeNode class to represent each node in the binary tree
	    static class TreeNode {
	        int val;
	        TreeNode left;
	        TreeNode right;

	        TreeNode(int val) {
	            this.val = val;
	        }
	    }

	    // Method to build a binary tree from level-order input
	    public static TreeNode buildTreeLevelOrder(Scanner sc) {
	        int val = sc.nextInt();
	        if (val == -1) return null; // Null node

	        TreeNode root = new TreeNode(val);
	        Queue<TreeNode> queue = new LinkedList<>();
	        queue.add(root);

	        while (!queue.isEmpty()) {
	            TreeNode current = queue.poll();

	            int leftVal = sc.nextInt();
	            if (leftVal != -1) {
	                current.left = new TreeNode(leftVal);
	                queue.add(current.left);
	            }

	            int rightVal = sc.nextInt();
	            if (rightVal != -1) {
	                current.right = new TreeNode(rightVal);
	                queue.add(current.right);
	            }
	        }

	        return root;
	    }

	    // Method to build a binary tree from pre-order input
	    public static TreeNode buildTreePreOrder(Scanner sc) {
	        int val = sc.nextInt();
	        if (val == -1) return null; // Null node

	        TreeNode root = new TreeNode(val);
	        root.left = buildTreePreOrder(sc);
	        root.right = buildTreePreOrder(sc);
	        return root;
	    }

	 

	    // Method to build a binary tree from post-order input
	    public static TreeNode buildTreePostOrder(Scanner sc) {
	        int val = sc.nextInt();
	        if (val == -1) return null; // Null node

	        TreeNode root = new TreeNode(val);
	        root.right = buildTreePostOrder(sc);
	        root.left = buildTreePostOrder(sc);
	        return root;
	    }

	    // Pre-order Traversal
	    public static void preOrder(TreeNode node) {
	        if (node == null) return;
	        System.out.print(node.val + " ");
	        preOrder(node.left);
	        preOrder(node.right);
	    }

	    // In-order Traversal
	    public static void inOrder(TreeNode node) {
	        if (node == null) return;
	        inOrder(node.left);
	        System.out.print(node.val + " ");
	        inOrder(node.right);
	    }

	    // Post-order Traversal
	    public static void postOrder(TreeNode node) {
	        if (node == null) return;
	        postOrder(node.left);
	        postOrder(node.right);
	        System.out.print(node.val + " ");
	    }

	    // Print leaf nodes
	    public static void printLeafNodes(TreeNode node) {
	        if (node == null) return;
	        if (node.left == null && node.right == null) {
	            System.out.print(node.val + " ");
	        }
	        printLeafNodes(node.left);
	        printLeafNodes(node.right);
	    }

	    public static void main(String[] args) {
	    
	    	    Scanner sc = new Scanner(System.in);

	    	    // Build and test pre-order tree
	    	    System.out.println("Enter tree nodes in pre-order format (-1 for null nodes):");
	    	    TreeNode preOrderRoot = buildTreePreOrder(sc);
	    	    System.out.println("\nPre-order input tree traversal:");
	    	    System.out.print("Pre-order: ");
	    	    preOrder(preOrderRoot);
	    	    System.out.println();

	    	    sc.close();
	    	}


	    }
	


