package Trees;
import java.util.*;

public class Binary_Tree {
    public class Node {
        protected int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);

    public Binary_Tree() {
        this.root = createTree();
    }

    private Node createTree() {
        System.out.println("Enter node value:");
        int val = sc.nextInt();
        Node nn = new Node();
        nn.val = val;
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

    public void Display() {
        display(root);
    }

    private void display(Node temp) {
        if (temp == null) {
            return;
        }
        String s = "" + temp.val;
        if (temp.left != null) {
            s = temp.left.val + "<--" + s;
        } else {
            s = ". <--" + s;
        }
        if (temp.right != null) {
            s = s + "-->" + temp.right.val;
        } else {
            s = s + "--> .";
        }
        System.out.println(s);
        display(temp.left);
        display(temp.right);
    }

    public int Max() {
        return max(root);
    }

    private int max(Node temp) {
        if (temp == null) {
            return Integer.MIN_VALUE;
        }
        int leftmax = max(temp.left);
        int rightmax = max(temp.right);

        return Math.max(temp.val, Math.max(leftmax, rightmax));
    }

    public int Min() {
        return min(root);
    }

    private int min(Node temp) {
        if (temp == null) {
            return Integer.MAX_VALUE;
        }
        int leftmin = min(temp.left);
        int rightmin = min(temp.right);

        return Math.min(temp.val, Math.min(leftmin, rightmin));
    }

    public int Height() {
        return height(root);
    }

    private int height(Node temp) {
        if (temp == null) {
            return -1;
        }
        int leftHeight = height(temp.left);
        int rightHeight = height(temp.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public boolean Find(int k) {
        return find(this.root, k);
    }

    private boolean find(Node node, int k) {
        if (node == null) {
            return false;
        }
        if (node.val == k) {
            return true;
        }

        boolean left = find(node.left, k);
        boolean right = find(node.right, k);

        return left || right;
    }

    public static void main(String[] args) {
        Binary_Tree bt = new Binary_Tree();
        System.out.println("Tree Structure:");
        bt.Display();
        System.out.println("Maximum value in the tree: " + bt.Max());
        System.out.println("Minimum value in the tree: " + bt.Min());
        System.out.println("Height of the tree: " + bt.Height());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to find:");
        int valueToFind = sc.nextInt();
        if (bt.Find(valueToFind)) {
            System.out.println(valueToFind + " is present in the tree.");
        } else {
            System.out.println(valueToFind + " is not present in the tree.");
        }
    }
}
