package Contest8_Trees_andLeetcode;

public class Max_Path_Sum {
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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        max(root);
        return ans;
    }
    private int max(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, max(root.left));
        int right = Math.max(0, max(root.right));
        int self = root.val + left + right;
        ans = Math.max(ans, self);
        return root.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        Max_Path_Sum maxPathSumCalc = new Max_Path_Sum();
        TreeNode root = maxPathSumCalc.new TreeNode(1);
        root.left = maxPathSumCalc.new TreeNode(2);
        root.right = maxPathSumCalc.new TreeNode(3);
        int result = maxPathSumCalc.maxPathSum(root);
        System.out.println("Maximum Path Sum: " + result); 
    }
}
