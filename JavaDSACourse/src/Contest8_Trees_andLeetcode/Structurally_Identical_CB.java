package Contest8_Trees_andLeetcode;

import java.util.Scanner;

public class Structurally_Identical_CB {

    public static class TreeNode {
        protected int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    private Scanner sc = new Scanner(System.in);
    public TreeNode createTree() {
        System.out.println("Enter the node value:");
        int item = sc.nextInt();
        TreeNode nn = new TreeNode(item);
        
        System.out.println("Has left child? (true/false)");
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }
        
        System.out.println("Has right child? (true/false)");
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }
        
        return nn;
    }
    public static boolean isStructurallyIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean left = isStructurallyIdentical(root1.left, root2.left);
        boolean right = isStructurallyIdentical(root1.right, root2.right);
        return left && right;
    }

    public static void main(String[] args) {
        Structurally_Identical_CB st = new Structurally_Identical_CB();
        TreeNode root1 = st.createTree();
       
        TreeNode root2 = st.createTree();
        boolean result = isStructurallyIdentical(root1, root2);
        System.out.println(result);
    }
}
