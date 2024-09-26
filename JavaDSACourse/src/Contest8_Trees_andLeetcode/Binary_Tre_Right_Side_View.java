package Contest8_Trees_andLeetcode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tre_Right_Side_View {
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
    public List<Integer> rightSideView(TreeNode root) {
        return dfs(root, 0, new ArrayList<>(), -1);
    }
    public List<Integer> dfs(TreeNode temp, int currLvl, List<Integer> result, int maxLvl) {
        if (temp == null) {
            return result;
        }
        if (currLvl > maxLvl) {
            result.add(temp.val);
            maxLvl = currLvl;
        }
        dfs(temp.right, currLvl + 1, result, maxLvl);
        dfs(temp.left, currLvl + 1, result, maxLvl);
        return result;
    }

    public static void main(String[] args) {
        Binary_Tre_Right_Side_View rightSideViewObj = new Binary_Tre_Right_Side_View();
        TreeNode root = rightSideViewObj.new TreeNode(1);
        root.left = rightSideViewObj.new TreeNode(2);
        root.right = rightSideViewObj.new TreeNode(3);
        root.left.right = rightSideViewObj.new TreeNode(5);
        root.right.right = rightSideViewObj.new TreeNode(4);
        List<Integer> rightSide = rightSideViewObj.rightSideView(root);
        System.out.println("Right side view of the binary tree: " + rightSide);
    }
}
