package Contest8_Trees_andLeetcode;

import java.util.*;

public class Create_tree_Using_preorder_inorder {

    // Node class definition
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

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] preorder = readArray(scn);
        int[] inorder = readArray(scn);
        TreeNode root = constructTree(preorder, inorder);
        displayTree(root);
        
        scn.close();
    }
    private static int[] readArray(Scanner scn) {
        int size = scn.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }
        return array;
    }
    private static TreeNode constructTree(int[] preorder, int[] inorder) {
        return construct(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    private static TreeNode construct(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
        if (plo > phi || ilo > ihi) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[plo]);
        int rootIndex = -1;
        for (int i = ilo; i <= ihi; i++) {
            if (inorder[i] == preorder[plo]) {
                rootIndex = i;
                break;
            }
        }
        int leftSize = rootIndex - ilo;
        root.left = construct(preorder, plo + 1, plo + leftSize, inorder, ilo, rootIndex - 1);
        root.right = construct(preorder, plo + leftSize + 1, phi, inorder, rootIndex + 1, ihi);

        return root;
    }
    private static void displayTree(TreeNode root) {
        display(root);
    }

    private static void display(TreeNode node) {
        if (node == null) {
            return;
        }

        StringBuilder str = new StringBuilder();

        if (node.left != null) {
            str.append(node.left.val);
        } else {
            str.append("END");
        }

        str.append(" => ").append(node.val).append(" <= ");

        if (node.right != null) {
            str.append(node.right.val);
        } else {
            str.append("END");
        }

        System.out.println(str.toString());

        display(node.left);
        display(node.right);
    }
}

