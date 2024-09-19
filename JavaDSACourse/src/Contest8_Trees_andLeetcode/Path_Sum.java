package Contest8_Trees_andLeetcode;

public class Path_Sum {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return PathSum(root, targetSum, 0);
    }
    private boolean PathSum(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }

        sum += root.val; 
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }
        return PathSum(root.left, targetSum, sum) || PathSum(root.right, targetSum, sum);
    }

    public static void main(String[] args) {
        Path_Sum pathSumChecker = new Path_Sum();

        TreeNode root = pathSumChecker.new TreeNode(5);
        root.left = pathSumChecker.new TreeNode(4);
        root.right = pathSumChecker.new TreeNode(8);
        root.left.left = pathSumChecker.new TreeNode(11);
        root.left.left.left = pathSumChecker.new TreeNode(7);
        root.left.left.right = pathSumChecker.new TreeNode(2);
        root.right.left = pathSumChecker.new TreeNode(13);
        root.right.right = pathSumChecker.new TreeNode(4);
        root.right.right.right = pathSumChecker.new TreeNode(1);

        int targetSum = 22;
        boolean result = pathSumChecker.hasPathSum(root, targetSum);
        System.out.println("Has Path Sum equal to " + targetSum + ": " + result);
    }
}
